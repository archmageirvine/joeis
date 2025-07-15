package irvine.oeis.a367;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A367573 Table read by rows: row n is the only primitive Pythagorean triple whose inradius is the n-th prime and whose short leg is an odd number.
 * @author Sean A. Irvine
 */
public class A367573 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.square().add(p).multiply2();
  }
}
