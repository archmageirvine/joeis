package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068358 Numbers k such that the first digit of binomial(2k,k) is 1.
 * @author Sean A. Irvine
 */
public class A068358 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(2 * ++mN, mN).toString().startsWith("1")) {
        return Z.valueOf(mN);
      }
    }
  }
}
