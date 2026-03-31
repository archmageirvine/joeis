package irvine.oeis.a025;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A025046 a(n) is the least odd prime p such that the maximum run length of consecutive quadratic residues modulo p is n.
 * @author Sean A. Irvine
 */
public class A025046 extends Sequence2 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mFirsts = new DynamicIntArray();
  private final DynamicIntArray mFirstValues = new DynamicIntArray();
  private final Fast mPrime = new Fast();
  private int mN = 1;

  private boolean[] markQuadraticResidues(final long p) {
    final boolean[] seen = new boolean[Math.toIntExact(p)];
    for (long k = 0; k < p; ++k) {
      seen[(int) ((k * k) % p)] = true;
    }
    return seen;
  }

  private void process(final long p) {
    final boolean[] seen = markQuadraticResidues(p);
    int longest = 0;
    int longestFirstValue = 0;
    int runLength = 0;

    // Find longest run of consecutive quadratic residues
    for (int k = 0; k < p; ++k) {
      if (!seen[k]) {
        if (runLength > longest) {
          longest = runLength;
          longestFirstValue = k - longest;
        }
        runLength = 0;
      } else {
        ++runLength;
      }
    }
    // Handle wrap around
    long last = p;
    for (int k = 0; k < p && seen[k]; ++k) {
      ++runLength;
      ++last;
    }
    if (runLength > longest) {
      longest = runLength;
      longestFirstValue = (int) (last - longest);
    }
    if (mFirsts.get(longest) == 0) {
      mFirsts.set(longest, (int) p);
      mFirstValues.set(longest, longestFirstValue);
      if (mVerbose) {
        StringUtils.message("Solution for n=" + longest + " is p=" + p + " [least residue=" + longestFirstValue + "]");
      }
    }
  }

  protected Z select(final long p, final long least) {
    return Z.valueOf(p);
  }

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (mFirsts.get(mN) == 0) {
      p = mPrime.nextPrime(p);
      process(p);
    }
    return select(mFirsts.get(mN), mFirstValues.get(mN));
  }
}

