package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081699 k-tuple abundance record-holders.
 * @author Sean A. Irvine
 */
public class A081699 extends Sequence1 {

  private long mA = 0;
  private long mN = 11;

  static long count(Z n) {
    long cnt = 0;
    while (true) {
      final Z t = Functions.SIGMA1.z(n).subtract(n);
      if (t.compareTo(n) > 0) {
        ++cnt;
        n = t;
      } else {
        return cnt;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      final long cnt = count(Z.valueOf(++mN));
      if (cnt > mA) {
        mA = cnt;
        return Z.valueOf(mN);
      }
    }
  }
}
