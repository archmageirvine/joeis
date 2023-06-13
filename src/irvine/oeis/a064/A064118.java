package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064118 Numbers k such that the first k digits of e form a prime.
 * @author Sean A. Irvine
 */
public class A064118 extends Sequence1 {

  private long mN = 0;
  private Z mT = null;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT == null ? Z.ONE : mT.multiply(10);
      if (CR.E.multiply(mT).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
