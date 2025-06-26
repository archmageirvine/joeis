package irvine.oeis.a078;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A078256 Triangular numbers in which frequency of occurrence of every digit is same.
 * @author Sean A. Irvine
 */
public class A078256 extends Sequence1 {

  private final Sequence mTriangular = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z s = mTriangular.next();
      if (IntegerUtils.isNonzeroConstant(ZUtils.digitCounts(s)) > 0) {
        return s;
      }
    }
  }
}

