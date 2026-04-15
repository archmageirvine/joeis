package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A133420 Number of steps to reach 1 under repeated applications of the "5x+1" map of A133419, or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A133420 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return n.isEven() ? n.divide2() : (n.mod(3) == 0 ? n.divide(3) : n.multiply(5).add(1));
  }

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    long cnt = 0;
    while (!n.isOne()) {
      n = f(n);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
