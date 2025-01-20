package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074295 Dominant (i.e., most populous) digit in Kolakoski sequence (A000002) when partitioned into groups of 7.
 * @author Sean A. Irvine
 */
public class A074295 extends A000002 {

  @Override
  public Z next() {
    long t = 0;
    for (int k = 0; k < 7; ++k) {
      t += super.next().longValue();
    }
    return t <= 10 ? Z.ONE : Z.TWO;
  }
}
