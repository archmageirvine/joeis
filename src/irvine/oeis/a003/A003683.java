package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003683 a(n) = 2^(n-1)*(2^n - (-1)^n)/3.
 * @author Sean A. Irvine
 */
public class A003683 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).signedAdd((mN & 1) == 1, Z.ONE).divide(3).shiftLeft(mN - 1);
  }
}
