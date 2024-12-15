package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073597 Write Pi = 3.d(1)d(2)d(3)... where d(m) is the m-th digit of the decimal expansion of Pi. Then a(n) = m is the smallest integer such that 1/(n+1) &lt; 0.d(m)d(m+1)d(m+2)... &lt; 1/n.
 * @author Sean A. Irvine
 */
public class A073597 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = -1;
    while (true) {
      if (CR.PI.multiply(Z.TEN.pow(++m)).frac().inverse().floor().equals(mN)) {
        return Z.valueOf(m + 1);
      }
    }
  }
}
