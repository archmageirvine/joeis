package irvine.oeis.a128;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A128465 Numbers k such that k divides the numerator of alternating Harmonic number H'((k+1)/2) = A058313((k+1)/2).
 * @author Sean A. Irvine
 */
public class A128465 extends Sequence1 {

  private long mN = 0;
  private long mV = -1;
  private Q mA = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Q q = new Q(1, ++mN);
      mA = mA.signedAdd((mN & 1) == 0, q);
      final Z num = mA.num();
      mV += 2;
      if (num.mod(mV) == 0) {
        return Z.valueOf(mV);
      }
    }
  }
}

