package irvine.oeis.a075;

import irvine.math.IntegerUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075107 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Q x = new Q(mN, IntegerUtils.floorLog2(mN));
    long cnt = 0;
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
