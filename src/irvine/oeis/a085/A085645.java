package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a331.A331029;

/**
 * A085645 Smallest number having exactly n divisors ending with 1 or 9.
 * @author Sean A. Irvine
 */
public class A085645 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A331029();
    while (true) {
      final Z k = s.next();
      long cnt = 0;
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (Math.abs(d.mod(10) - 5) == 4) {
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
