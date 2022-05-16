package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007592 Hyperperfect numbers: k = m*(sigma(k) - k - 1) + 1 for some m &gt; 1.
 * @author Sean A. Irvine
 */
public class A007592 implements Sequence {

  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Jaguar.factor(++mN).sigma().longValueExact();
      final long s = sigma - mN - 1;
      if (s != 0 && s != mN - 1 && (mN - 1) % s == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
