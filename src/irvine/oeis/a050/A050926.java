package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A050926 Binary representation of A007908(n).
 * @author Sean A. Irvine
 */
public class A050926 extends A007908 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
