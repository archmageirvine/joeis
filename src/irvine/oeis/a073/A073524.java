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
    long cnt = 0;
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

