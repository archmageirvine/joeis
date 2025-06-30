package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075578 Smaller of two successive 4th powers whose sum is a prime.
 * @author Sean A. Irvine
 */
public class A075578 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).pow(4);
      if (s.add(Z.valueOf(mN + 1).pow(4)).isProbablePrime()) {
        return s;
      }
    }
  }
}

