package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076080 a(n) = A076079(n)/n.
 * @author Sean A. Irvine
 */
public class A076080 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(1).divide(++mN);
  }
}
