package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A068500 Sequence of Fibonacci numbers whose sum of decimal digits sets a new record.
 * @author Sean A. Irvine
 */
public class A068500 extends Sequence1 {

  private final Sequence mF = new A000045();
  private long mRecord = 0;

  @Override
  public Z next() {
    while (true) {
      final Z f = mF.next();
      final long sum = ZUtils.digitSum(f);
      if (sum > mRecord) {
        mRecord = sum;
        return f;
      }
    }
  }
}

