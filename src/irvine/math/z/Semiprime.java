package irvine.math.z;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.util.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Routines to test for semiprimes using optional helpers.
 * @author Sean A. Irvine
 */
public class Semiprime {

  private final HashSet<Z> mHelpers = new HashSet<>();
  private final Fast mPrime = new Fast();
  private final boolean mSmallOnly;
  private boolean mVerbose = false;

  private void initHelpers(final String resource) throws IOException {
    if (resource != null) {
      try (final BufferedReader r = IOUtils.reader(resource)) {
        String line;
        while ((line = r.readLine()) != null) {
          if (!line.isEmpty()) {
            mHelpers.add(new Z(line));
          }
        }
      }
    }
  }

  /**
   * Construct a new object for testing for semiprimes.
   *
   * @param helperResource helper factors
   * @param onlyUseHelpers don't try an extensive search if factor not in helpers
   */
  public Semiprime(final String helperResource, final boolean onlyUseHelpers) {
    try {
      initHelpers(helperResource);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    mSmallOnly = onlyUseHelpers;
  }

  /**
   * Construct a new object for testing for semiprimes.
   *
   * @param helperResource helper factors
   */
  public Semiprime(final String helperResource) {
    this(helperResource, false);
  }

  public void setVerbose(final boolean verbose) {
    mVerbose = verbose;
  }

  private static final long SMALL_PRIME_SEARCH_LIMIT = 10000;

  /**
   * Test the semiprime status of a number.  If the number is not a semiprime
   * then null is returned; otherwise the factorization is returned.
   *
   * @param n number to test
   * @return a <code>FactorSequence</code> value
   */
  public FactorSequence semiprime(Z n) {
    if (mVerbose) {
      System.out.println("Semiprime candidate: " + n);
    }
    if (Z.ONE.compareTo(n) >= 0) {
      return null;
    }
    final FactorSequence fs = new FactorSequence();
    final int lsb = n.getLowestSetBit();
    if (lsb > 1) {
      return null;
    }
    n = n.shiftRight(lsb);
    if (lsb > 0) {
      fs.add(2, FactorSequence.PRIME, lsb);
    }
    int c = lsb;
    for (final Z h : mHelpers) {
      if (Z.ZERO.equals(n.mod(h))) {
        n = n.divide(h);
        fs.add(h, FactorSequence.PRIME);
        ++c;
        // Need at most one helper
        break;
      }
    }
    boolean dolarge = false;
    long p = 2;
    while (true) {
      if (c > 2) {
        return null;
      }
      if (c == 2) {
        if (Z.ONE.equals(n)) {
          return fs;
        } else {
          return null;
        }
      }
      // This next condition is for speed, avoids doing a costly primality
      // test until we have tried lots of small factors.
      if (n.bitLength() < 256 || p > SMALL_PRIME_SEARCH_LIMIT) {
        if (mPrime.isPrime(n)) {
          fs.add(n, FactorSequence.PROB_PRIME);
          return c == 1 ? fs : null;
        }
        if (mSmallOnly) {
          fs.add(n, FactorSequence.COMPOSITE);
          return fs;
        }
        if (c > 0) {
          return null;
        }
      }
      boolean nofactor = true;
      while (nofactor) {
        p = mPrime.nextPrime(p);
        if (p > SMALL_PRIME_SEARCH_LIMIT && !dolarge) {
          dolarge = true;
          nofactor = false;
        }
        while (n.mod(p) == 0) {
          ++c;
          fs.add(p, FactorSequence.PRIME);
          n = n.divide(p);
          if (mVerbose) {
            System.out.println("Found <" + p + ">");
          }
          nofactor = false;
        }
      }
    }
  }
}

