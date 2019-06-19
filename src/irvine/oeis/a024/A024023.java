package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A024023 <code>a(n) = 3^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A024023 extends A000244 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
