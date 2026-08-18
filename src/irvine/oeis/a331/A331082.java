package irvine.oeis.a331;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A331082 Smallest number having exactly n divisors ending with 3 or 7.
 * @author Sean A. Irvine
 */
public class A331082 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A331029();
    while (true) {
      final Z k = s.next();
      long cnt = 0;
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (Math.abs(d.mod(10) - 5) == 2) {
          if (++cnt > mN) {
            break;
          }
        }
      }
      if (cnt == mN) {
        return k;
      }
    }
  }
}
