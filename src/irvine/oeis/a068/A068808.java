package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068808 Triangular numbers with strictly increasing sum of digits.
 * @author Sean A. Irvine
 */
public class A068808 extends Sequence1 {

  private final Sequence mT = new A000217();
  private long mRecord = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      final long s = ZUtils.digitSum(t);
      if (s > mRecord) {
        mRecord = s;
        return t;
      }
    }
  }
}

