package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007365 Smallest k such that sigma(n+k) = sigma(k).
 * @author Sean A. Irvine
 */
public class A007365 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Jaguar.factor(k).sigma().equals(Jaguar.factor(mN + k).sigma())) {
        return Z.valueOf(k);
      }
    }
  }
}
