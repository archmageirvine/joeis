package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a081.A081847;

/**
 * A082235 Triangular numbers obtained as a concatenation of successive terms of A081847.
 * @author Sean A. Irvine
 */
public class A082235 extends A081847 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return new Z(t.toString() + mA);
  }
}
