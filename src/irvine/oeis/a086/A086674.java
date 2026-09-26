package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001318;

/**
 * A086674 Sum of signed indices from Euler's Pentagonal Theorem (see A000041).
 * @author Sean A. Irvine
 */
public class A086674 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence gp = new A001318().skip();
    final Z n = Z.valueOf(++mN);
    Z sum = Z.ZERO;
    long i = -1;
    while (true) {
      final Z k = gp.next();
      final Z t = n.subtract(k);
      if (t.signum() <= 0) {
        break;
      }
      sum = sum.signedAdd(((++i / 2) & 1) == 0, t);
    }
    return sum;
  }
}
