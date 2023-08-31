package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065343 Smallest k such that usigma(n+k) = usigma(k).
 * @author Sean A. Irvine
 */
public class A065343 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Jaguar.factor(mN + ++k).unitarySigma().equals(Jaguar.factor(k).unitarySigma())) {
        return Z.valueOf(k);
      }
    }
  }
}
