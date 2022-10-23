package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003674 2^(n-1)*( 2^n - (-1)^n ).
 * @author Sean A. Irvine
 */
public class A003674 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).signedAdd((mN & 1) == 1, Z.ONE).shiftLeft(mN - 1);
  }
}
