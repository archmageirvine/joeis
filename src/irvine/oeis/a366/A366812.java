package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a006.A006862;

/**
 * A064145.
 * @author Sean A. Irvine
 */
public class A366812 extends A006862 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma();
  }
}
