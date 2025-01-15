package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074223 Numbers n such that ceiling(n^e) is prime.
 * @author Sean A. Irvine
 */
public class A074223 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).pow(CR.E).ceil().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
