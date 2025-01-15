package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074219 Numbers k such that ceiling(k^Pi) is prime.
 * @author Sean A. Irvine
 */
public class A074219 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).pow(CR.PI).ceil().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
