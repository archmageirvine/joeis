package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055942 Smallest k &gt; 1 such that k | Sigma(k) + n.
 * @author Sean A. Irvine
 */
public class A055942 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Jaguar.factor(++k).sigma().add(mN).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
