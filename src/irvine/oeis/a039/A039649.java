package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A039649 a(n) = phi(n)+1.
 * @author Sean A. Irvine
 */
public class A039649 extends A000010 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
