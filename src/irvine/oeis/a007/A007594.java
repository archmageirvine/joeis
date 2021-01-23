package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007594 Smallest n-hyperperfect number: m such that m=n(sigma(m)-m-1)+1; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A007594 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      final long sigma = Cheetah.factor(++m).sigma().longValueExact();
      final long s = sigma - m - 1;
      if (mN * s == m - 1) {
        return Z.valueOf(m);
      }
    }
  }
}
