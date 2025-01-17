package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074217 Numbers k such that floor(k^Pi) is a prime.
 * @author Sean A. Irvine
 */
public class A074217 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).pow(CR.PI).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
