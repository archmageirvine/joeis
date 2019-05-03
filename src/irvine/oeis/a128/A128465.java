package irvine.oeis.a128;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A128465 Numbers n such that n divides the numerator of alternating Harmonic number <code>H'((n+1)/2) = A058313((n+1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A128465 implements Sequence {

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

