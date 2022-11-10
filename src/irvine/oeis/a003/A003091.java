package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003091 a(n) = floor( 2^(n*(n-1)/2) / n! ).
 * @author Sean A. Irvine
 */
public class A003091 extends Sequence1 {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return Z.ONE.shiftLeft((mN * mN - mN) / 2).divide(mF);
  }
}
