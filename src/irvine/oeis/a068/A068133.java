package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A068133 First triangular number with digit sum = n-th triangular number.
 * @author Sean A. Irvine
 */
public class A068133 extends A000217 {

  @Override
  public Z next() {
    final long target = super.next().longValueExact();
    final Sequence triangular = new A000217();
    while (true) {
      final Z t = triangular.next();
      if (ZUtils.digitSum(t) == target) {
        return t;
      }
    }
  }
}
