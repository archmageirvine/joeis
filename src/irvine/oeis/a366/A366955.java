package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A110756.
 * @author Sean A. Irvine
 */
public class A366955 extends A007908 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
