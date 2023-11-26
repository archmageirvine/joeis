package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066928 Numbers k such that floor(k*log(k)) is prime.
 * @author Sean A. Irvine
 */
public class A066928 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).log().multiply(mN).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
