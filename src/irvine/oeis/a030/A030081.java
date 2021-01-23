package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030081 a(n) = prime^2 and digits of prime appear in a(n).
 * @author Sean A. Irvine
 */
public class A030081 extends A030079 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
