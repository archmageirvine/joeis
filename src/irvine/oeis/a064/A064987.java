package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A064987 a(n) = n*sigma(n).
 * @author Sean A. Irvine
 */
public class A064987 extends A000203 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
