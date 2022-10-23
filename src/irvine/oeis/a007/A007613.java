package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007613 a(n) = (8^n + 2(-1)^n)/3.
 * @author Sean A. Irvine
 */
public class A007613 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(3 * ++mN).signedAdd((mN & 1) == 0, Z.TWO).divide(3);
  }
}
