package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065569 Smallest k such that omega(n+k) = omega(k).
 * @author Sean A. Irvine
 */
public class A065569 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Jaguar.factor(++k).omega() == Jaguar.factor(mN + k).omega()) {
        return Z.valueOf(k);
      }
    }
  }
}
