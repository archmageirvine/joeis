package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046081 Number of integer-sided right triangles with n as a hypotenuse or leg.
 * @author Sean A. Irvine
 */
public class A046081 extends A046080 {

  private final Sequence mA = new A046079();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
