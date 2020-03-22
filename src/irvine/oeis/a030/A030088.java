package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030088 <code>a(n) = prime^2</code> and digits of prime do not appear in <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A030088 extends A030086 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
