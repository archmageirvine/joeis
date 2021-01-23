package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A024024 a(n) = 3^n - n.
 * @author Sean A. Irvine
 */
public class A024024 extends A000244 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
