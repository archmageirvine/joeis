package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A056600.
 * @author Sean A. Irvine
 */
public class A056602 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0;

  private void search(final Z a, final Z b, final Z c, final int aRem, final int bRem, final int cRem, final long p) {
    // Check if we have a solution
    if (aRem == 0 && bRem == 0 && cRem == 0) {
      if (a.equals(b.add(c))) {
        if (mVerbose) {
          StringUtils.message(a + " = " + b + " + " + c);
        }
        mA.add(a);
      }
      return;
    }
    // Check if a solution will be impossible
    if (aRem == 0 && b.add(c).compareTo(a) > 0) {
      return;
    }
    // Add the next prime to each possible product (a, b, c)
    final long q = mPrime.nextPrime(p);
    if (aRem > 0) {
      search(a.multiply(q), b, c, aRem - 1, bRem, cRem, q);
    }
    if (bRem > 0) {
      search(a, b.multiply(q), c, aRem, bRem - 1, cRem, q);
    }
    if (cRem > 0 && !Z.ONE.equals(b)) { // WLOG symmetry breaking between b and c
      search(a, b, c.multiply(q), aRem, bRem, cRem - 1, q);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      search(Z.ONE, Z.ONE, Z.ONE, mN + 1, mN, mN, 1);
    }
    return mA.pollFirst();
  }

}

