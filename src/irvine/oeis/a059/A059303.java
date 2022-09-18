package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059303 Numbers n such that floor(e^n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A059303 implements Sequence {

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
