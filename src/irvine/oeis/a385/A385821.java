package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385821 Numbers k such that ceiling((k^2 + 1)/2) is prime.
 * @author Sean A. Irvine
 */
public class A385821 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).square().add(2).divide2().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

