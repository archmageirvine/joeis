package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080394 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(++mN, mN / 2).mod(mN * mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
