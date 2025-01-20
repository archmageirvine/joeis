package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074292 Dominant digit in successive groups of 3 from the Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A074292 extends A000002 {

  @Override
  public Z next() {
    final long t = super.next().longValue() + super.next().longValue() + super.next().longValue();
    return t <= 4 ? Z.ONE : Z.TWO;
  }
}
