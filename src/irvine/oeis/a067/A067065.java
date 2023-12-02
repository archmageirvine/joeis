package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067037.
 * @author Sean A. Irvine
 */
public class A067065 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Jaguar.factor(++mN).sigma();
      if (Jaguar.factor(Jaguar.factor(sigma).sigma()).sigma().equals(sigma.multiply(6))) {
        return Z.valueOf(mN);
      }
    }
  }
}

