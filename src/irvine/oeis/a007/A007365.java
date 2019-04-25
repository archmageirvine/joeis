package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007365 Smallest k such that <code>sigma(n+k) = sigma(k)</code>.
 * @author Sean A. Irvine
 */
public class A007365 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Cheetah.factor(k).sigma().equals(Cheetah.factor(mN + k).sigma())) {
        return Z.valueOf(k);
      }
    }
  }
}
