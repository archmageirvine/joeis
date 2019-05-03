package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002706 Theta series of 6-dimensional lattice <code>A_6^(2)</code> (other names for this lattice or the corresponding quadratic form are <code>LAMBDA_{3,lambda}, P_6^(5), phi_6, F_14)</code>.
 * @author Sean A. Irvine
 */
public class A002706 extends A002653 {

  private A002656 mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new A002656();
      return super.next();
    } else {
      return super.next().subtract(mA.next().multiply(6));
    }
  }
}
