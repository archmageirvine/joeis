package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074293 Dominant (i.e., most populous) digit in Kolakoski sequence (A000002) when partitioned into groups of 5.
 * @author Sean A. Irvine
 */
public class A074293 extends A000002 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final long t = super.next().longValue() + super.next().longValue() + super.next().longValue() + super.next().longValue() + super.next().longValue();
    return t <= 7 ? Z.ONE : Z.TWO;
  }
}
