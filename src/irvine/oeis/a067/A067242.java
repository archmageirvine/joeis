package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067242 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(mN++).sigma().add(Jaguar.factor(mN + 1).sigma()).equals(Euler.phi(mN).multiply(5))) {
        return Z.valueOf(mN);
      }
    }
  }
}

