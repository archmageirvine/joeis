package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002700 Coefficients of Chebyshev polynomials: n(2n+1)2^(2n-2).
 * @author Sean A. Irvine
 */
public class A002700 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(2 * mN + 1).shiftLeft(2 * mN - 2);
  }
}
