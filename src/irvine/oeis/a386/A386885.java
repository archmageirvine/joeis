package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386885 a(n) is the number of iterations that -n requires to reach 1 under the map x -&gt; -x/2 if x is even, 3x + 1 if x is odd.
 * @author Sean A. Irvine
 */
public class A386885 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    Z m = mN;
    while (!Z.NEG_ONE.equals(m)) {
      ++cnt;
      m = m.isOdd() ? m.multiply(3).subtract(1) : m.divide2().negate();
    }
    return Z.valueOf(cnt);
  }
}
