package irvine.oeis.a168;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A168013 <code>a(n) =</code> Sum of all divisors of all numbers <code>&lt; (n+1)^2</code>.
 * @author Sean A. Irvine
 */
public class A168013 implements Sequence {

  private long mN = 1;
  private long mNext = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    final long limit = mN * mN;
    while (mNext < limit) {
      mSum = mSum.add(Cheetah.factor(mNext++).sigma());
    }
    return mSum;
  }
}

