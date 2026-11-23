package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087522 a(0) = 2; for n&gt;=1, a(n) = smallest prime p such that p+1 is divisible by an n-th power &gt; 1.
 * @author Sean A. Irvine
 */
public class A087522 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.TWO;
    }
    final Z s = Z.ONE.shiftLeft(mN);
    Z t = s.subtract(1);
    while (!t.isProbablePrime()) {
      t = t.add(s);
    }
    return t;
  }
}
