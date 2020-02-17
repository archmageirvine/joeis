package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028949 Write numbers from 1 to <code>n(n+1)/2</code> in a triangular array <code>(a)</code> downwards and <code>(b)</code> across; <code>a(n)</code> is number of numbers in same position in both.
 * @author Sean A. Irvine
 */
public class A028949 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Cheetah.factor(Z.valueOf(2 * mN).subtract(6).multiply(mN).add(5)).sigma0().add(2);
  }
}

