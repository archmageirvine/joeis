package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030088 a(n) = prime^2 and digits of prime do not appear in a(n).
 * @author Sean A. Irvine
 */
public class A030088 extends A030086 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
