package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019567 Order of the Mongean shuffle permutation of <code>2n</code> cards: <code>a(n)</code> is least number m for which either 2^m <code>+ 1</code> or 2^m <code>- 1</code> is divisible by <code>4n + 1</code>.
 * @author Sean A. Irvine
 */
public class A019567 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(4);
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      final Z mod = Z.TWO.modPow(m, mN);
      if (mod.equals(Z.ONE) || mod.equals(mN.subtract(1))) {
        return m;
      }
    }
  }
}
