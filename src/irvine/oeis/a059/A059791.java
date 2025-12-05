package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059791 Numbers k such that floor(phi^k) is prime, where phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A059791 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (CR.PHI.pow(++mN).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
