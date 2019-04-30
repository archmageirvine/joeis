package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000203;

/**
 * A065387 <code>a(n) = sigma(n) + phi(n)</code>.
 * @author Sean A. Irvine
 */
public class A065387 extends A000010 {

  private A000203 mA = new A000203();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
