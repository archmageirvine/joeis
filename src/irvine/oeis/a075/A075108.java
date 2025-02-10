package irvine.oeis.a075;

import irvine.math.IntegerUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075108 First integer reached when starting with n/floor(log_2(n)) and iterating the map x -&gt; x*ceiling(x) A075107(n) times, or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A075108 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Q x = new Q(mN, IntegerUtils.floorLog2(mN));
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
    }
    return x.toZ();
  }
}
