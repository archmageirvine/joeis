package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A068498 Fibonacci numbers whose sum of decimal digits is greater than its index.
 * @author Sean A. Irvine
 */
public class A068498 extends Sequence1 {

  private final Sequence mF = new A000045();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z f = mF.next();
      if (ZUtils.digitSum(f) > ++mN) {
        return f;
      }
    }
  }
}

