package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018215 a(n) = n*4^n.
 * @author Sean A. Irvine
 */
public class A018215 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(2L * ++mN).multiply(mN);
  }
}

