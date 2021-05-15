package irvine.math.powers;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.util.CliFlags;
import irvine.util.array.LongDynamicByteArray;
import irvine.util.string.StringUtils;

/**
 * Sum of an exact number of powers with big integer support.
 * @author Sean A. Irvine
 */
final class ResidueSearchZ {

  private final int mTerms;
  private final int mWays;
  private final Z mMin;
  private final Z[] mPowers;
  private int mOverflowReports = 0;

  private ResidueSearchZ(final int terms, final int power, final int ways, final int max, final Z min) {
    if (ways > 126 || ways < 2 || terms < 1 || power < 1) {
      throw new IllegalArgumentException();
    }
    mTerms = terms;
    mWays = ways;
    mMin = min;
    mPowers = makePowers(max, power);
  }

  private static long prevPrime(final long n) {
    if (n <= 2) {
      throw new IllegalArgumentException();
    }
    Z t = Z.valueOf(n | 1); // Make n odd
    do {
      t = t.subtract(2);
    } while (!t.isProbablePrime());
    return t.longValueExact();
  }

  // Precompute 1^power, 2^power, 3^power, ..., max^power
  static Z[] makePowers(final int max, final int power) {
    final Z[] res = new Z[max];
    for (int k = 1; k <= max; ++k) {
      res[k - 1] = Z.valueOf(k).pow(power);
    }
    return res;
  }

  // Recursive procedure to compute sums of powers
  private void insertSumsExact(final Z sum, final int maxIndex, final int remaining, final TreeMap<Z, Byte> cnts, final long prevMod, final LongDynamicByteArray prevCnt) {
    if (remaining == 0) {
      // We have completed the sum, check if this is a residue class to retain
      if (sum.compareTo(mMin) >= 0 && prevCnt.get(sum.mod(prevMod)) >= mWays) {
        // This sum successfully passed the previous test
        final Byte c = cnts.get(sum);
        if (c == null) {
          cnts.put(sum, (byte) 1);
        } else if (c < Byte.MAX_VALUE) {
          cnts.put(sum, (byte) (c + 1));
        } else {
          if (mOverflowReports < 10) {
            StringUtils.message("Warning: Counts in bin " + sum + " exceeds " + Byte.MAX_VALUE);
            if (++mOverflowReports == 10) {
              StringUtils.message("Turning off overflow reports");
            }
          }
        }
      }
      return;
    }

    // Add one more term into the sum and recurse
    for (int k = maxIndex; k >= 0; --k) {
      insertSumsExact(sum.add(mPowers[k]), k, remaining - 1, cnts, prevMod, prevCnt);
    }
  }

  // Recursive procedure to compute sums of powers
  private void insertSums(final Z sum, final int maxIndex, final int remaining, final LongDynamicByteArray cnts, final long mod, final long prevMod, final LongDynamicByteArray prevCnt) {
    if (remaining == 0) {
      // We have completed the sum, check if this is a residue class to retain
      if (sum.compareTo(mMin) >= 0 && prevCnt.get(sum.mod(prevMod)) >= mWays) {
        // This sum successfully passed the previous test
        final long n = sum.mod(mod);
        final byte c = cnts.get(n);
        if (c < Byte.MAX_VALUE) {
          cnts.set(n, (byte) (c + 1));
        } else {
          if (mOverflowReports < 10) {
            StringUtils.message("Warning: Counts in bin " + sum + " exceeds " + Byte.MAX_VALUE);
            if (++mOverflowReports == 10) {
              StringUtils.message("Turning off overflow reports");
            }
          }
        }
      }
      return;
    }

    // Add one more term into the sum and recurse
    for (int k = maxIndex; k >= 0; --k) {
      insertSums(sum.add(mPowers[k]), k, remaining - 1, cnts, mod, prevMod, prevCnt);
    }
  }

  private LongDynamicByteArray computeSumsModulo(final long mod, final long prevPrime, final LongDynamicByteArray prevCnt) {
    StringUtils.message("Computing sums modulo " + mod);
    mOverflowReports = 0;
    final LongDynamicByteArray cnts = new LongDynamicByteArray();
    insertSums(Z.ZERO, mPowers.length - 1, mTerms, cnts, mod, prevPrime, prevCnt);
    return cnts;
  }

  private long getOccupancy(final long mod, final LongDynamicByteArray cnts) {
    long occupancy = 0;
    for (long k = 0; k < mod; ++k) {
      if (cnts.get(k) >= mWays) {
        ++occupancy;
      }
    }
    return occupancy;
  }

  /**
   * Main program for powers.
   * @param args ignored.
   */
  public static void main(final String[] args) {
    final CliFlags flags = new CliFlags("Search for sums of like powers");
    flags.registerRequired('m', "terms", Integer.class, "int", "number of terms in the sum.");
    flags.registerRequired('n', "power", Integer.class, "int", "the power.");
    flags.registerRequired('s', "ways", Integer.class, "int", "minimum number of representations.");
    flags.registerRequired('t', "max", Integer.class, "int", "maximum base of power to consider.");
    flags.registerOptional('b', "bits", Integer.class, "int", "numbers of bits to use for residue classes.", 29);
    flags.registerOptional('l', "min", String.class, "int", "minimum sum to retain.", "1");
    flags.registerOptional('e', "exact", "only report solution with exact number of ways.");

    flags.setFlags(args);

    final int terms = (Integer) flags.getValue("terms");
    final int power = (Integer) flags.getValue("power");
    final int ways = (Integer) flags.getValue("ways");
    final int max = (Integer) flags.getValue("max");
    final int bits = (Integer) flags.getValue("bits");
    final Z min = new Z(flags.getValue("min").toString());
    final boolean exact = flags.isSet("exact");

    final ResidueSearchZ rs = new ResidueSearchZ(terms, power, ways, max, min);

    if (bits > 63 || bits < 1) {
      throw new UnsupportedOperationException();
    }

    StringUtils.message("Searching for sums of " + terms + " terms of x^" + power + " in at least " + ways + " ways with x <= " + max);
    StringUtils.message("Powers table built");

    long oldPrime = 1;
    long oldOccupancy = Long.MAX_VALUE;

    // Make a counts array that pretends we searched modulo 1
    LongDynamicByteArray cnts = new LongDynamicByteArray();
    cnts.set(0, (byte) ways);

    // Initial search modulo a prime
    long prime = prevPrime(1L << bits);
    cnts = rs.computeSumsModulo(prime, oldPrime, cnts);

    while (true) {
      final long occupancy = rs.getOccupancy(prime, cnts);
      StringUtils.message("Occupancy: " + occupancy + "/" + prime + " (" + DoubleUtils.NF2.format((100.0 * occupancy) / prime) + "%)");
      if (occupancy == 0) {
        StringUtils.message("There is no solution");
        return;
      }
      if (occupancy == prime) {
        StringUtils.message("Every residue occurred! Number of bits too small for this max");
        return;
      }
      if (occupancy >= oldOccupancy) {
        break; // We reached the limit of what we can gain by using primes
      }
      // Retry with a new prime
      oldPrime = prime;
      oldOccupancy = occupancy;
      prime = prevPrime(oldPrime);
      cnts = rs.computeSumsModulo(prime, oldPrime, cnts);
    }

    StringUtils.message("Starting final pass");
    final TreeMap<Z, Byte> res = new TreeMap<>();
    rs.insertSumsExact(Z.ZERO, max - 1, terms, res, prime, cnts);
    for (Map.Entry<Z, Byte> e : res.entrySet()) {
      if (exact) {
        if (e.getValue() == ways) {
          final Z v = e.getKey();
          if (v.compareTo(rs.mPowers[rs.mPowers.length - 1]) <= 0) {
            System.out.println(v);
          }
        }
      } else if (e.getValue() >= ways) {
        System.out.println(e.getKey() + " " + e.getValue());
      }
    }
  }
}
