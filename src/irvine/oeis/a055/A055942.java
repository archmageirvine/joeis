package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055942 Smallest k &gt; 1 such that k | Sigma(k) + n.
 * @author Sean A. Irvine
 */
public class A055942 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Cheetah.factor(++k).sigma().add(mN).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
