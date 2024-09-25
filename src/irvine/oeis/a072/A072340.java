package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A072340 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    Q x = new Q(++mN, 3);
    long cnt = 0;
    while (!x.isInteger()) {
      ++cnt;
      x = x.multiply(x.ceiling());
    }
    return Z.valueOf(cnt);
  }
}
