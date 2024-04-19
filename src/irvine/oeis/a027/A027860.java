package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000594;
import irvine.oeis.a013.A013959;

/**
 * A027860 a(n) = (-tau(n) + sigma_11(n)) / 691, where tau is Ramanujan's tau (A000594), sigma_11(n) = Sum_{ d divides n } d^11 (A013959).
 * @author Sean A. Irvine
 */
public class A027860 extends A013959 {

  private final Sequence mA = new A000594();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide(691);
  }
}
