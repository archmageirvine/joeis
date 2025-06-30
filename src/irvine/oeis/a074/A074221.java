package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074221 Numbers k such that floor(k^e) is prime.
 * @author Sean A. Irvine
 */
public class A074221 extends Sequence0 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).pow(CR.E).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
