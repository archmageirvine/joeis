package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387683.
 * @author Sean A. Irvine
 */
public class A387831 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SORT_DESCENDING.z(8, ++mN).equals(Functions.DIGIT_SORT_DESCENDING.z(8, 2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
