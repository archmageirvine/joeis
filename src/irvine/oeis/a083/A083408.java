package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066531.
 * @author Sean A. Irvine
 */
public class A083408 extends Sequence1 {

  private long mN = 251;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (A083406.is(s)) {
        return s;
      }
    }
  }
}
