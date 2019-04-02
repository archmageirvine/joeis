package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a029.A029850;

/**
 * A001424 Number of nonisomorphic and nonantiisomorphic groupoids with n elements.
 * @author Sean A. Irvine
 */
public class A001424 extends A001329 {

  private final Sequence mA029850 = new A029850();

  @Override
  public Z next() {
    return super.next().add(mA029850.next()).divide(2);
  }
}
