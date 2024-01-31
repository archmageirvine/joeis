package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A068134 Index of the smallest triangular number with digit sum = n-th triangular number.
 * @author Sean A. Irvine
 */
public class A068134 extends A000217 {

  @Override
  public Z next() {
    final long target = super.next().longValueExact();
    long k = -1;
    final Sequence triangular = new A000217();
    while (true) {
      ++k;
      if (ZUtils.digitSum(triangular.next()) == target) {
        return Z.valueOf(k);
      }
    }
  }
}
