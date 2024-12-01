package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073524 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Q x = new Q(++mN + 1, mN);
    long e = 250;
    while (true) {
      final Z mod = Z.valueOf(mN).pow(e);
      long cnt = 0;
      while (cnt <= e - 3 && !x.isInteger()) {
        x = x.multiply(x.ceiling());
        x = new Q(x.num().mod(mod), x.den().mod(mod));
        ++cnt;
      }
      if (cnt < e - 3) {
        return Z.valueOf(cnt);
      }
      e *= 2;
    }
  }
}
