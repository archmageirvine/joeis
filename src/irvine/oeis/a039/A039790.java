package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A039790 Prime numbers prefixed with a '1'.
 * @author Sean A. Irvine
 */
public class A039790 extends A000040 {

  @Override
  public Z next() {
    return new Z("1" + super.next());
  }
}
