package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A067520 Triangular numbers whose index is a multiple of the sum of their digits.
 * @author Sean A. Irvine
 */
public class A067520 extends Sequence1 {

  private final Sequence mTriangular = new A000217().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mTriangular.next();
      final long s = ZUtils.digitSum(t);
      if (++mN % s == 0) {
        return t;
      }
    }
  }
}

