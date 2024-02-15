package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068402 Numbers n such that sigma(n+1)=n+phi(n).
 * @author Sean A. Irvine
 */
public class A068402 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN + 1).sigma().equals(Euler.phi(mN).add(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
