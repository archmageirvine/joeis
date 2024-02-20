package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059303 Numbers k such that floor(e^k) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A059303 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).exp().floor().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
