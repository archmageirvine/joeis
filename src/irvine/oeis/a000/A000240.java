package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A000240 Rencontres numbers: number of permutations of [n] with exactly one fixed point.
 * @author Sean A. Irvine
 */
public class A000240 extends Sequence1 implements DirectSequence {

  private long mN = 0;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mPrev = mPrev.multiply(mN).add((mN & 1) == 0 ? -mN : mN);
    return mPrev;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    // a(n) = Sum_{k=0..n-1} (-1)^k*n!/k!
    return Integers.SINGLETON.sum(0, n - 1, k -> Z.NEG_ONE.pow(k).multiply(Functions.FALLING_FACTORIAL.z(n, n - k)));
  }

}

