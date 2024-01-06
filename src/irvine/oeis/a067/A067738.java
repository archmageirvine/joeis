package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067738 Numbers k such that sigma(k) + sigma(sigma(k)) is prime.
 * @author Sean A. Irvine
 */
public class A067738 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Jaguar.factor(++mN).sigma();
      if (Jaguar.factor(s).sigma().add(s).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
