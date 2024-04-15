package irvine.oeis.a067;

import irvine.math.function.Functions;
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
      final Z s = Functions.SIGMA.z(++mN);
      if (Functions.SIGMA.z(s).add(s).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
