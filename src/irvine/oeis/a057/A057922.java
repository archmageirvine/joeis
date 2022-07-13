package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057922 d(n) divides d(n+1), where d(n) is number of positive divisors of n.
 * @author Sean A. Irvine
 */
public class A057922 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = Jaguar.factor(++mN + 1).sigma0();
      if (mA.mod(t).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

