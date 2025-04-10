package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076597 Numbers k such that sqrt(k*(k-1)*(k-2)*(k-3)+1) is a prime.
 * @author Sean A. Irvine
 */
public class A076597 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z s = n.multiply(mN - 1).multiply(mN - 2).multiply(mN - 3).add(1);
      final Z[] r = s.sqrtAndRemainder();
      if (r[1].isZero() && r[0].isProbablePrime()) {
        return n;
      }
    }
  }
}
