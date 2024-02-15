package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068359 Binomial(2k,k) when the first digit of binomial(2k,k) is 1.
 * @author Sean A. Irvine
 */
public class A068359 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z b = Binomial.binomial(2 * ++mN, mN);
      if (b.toString().startsWith("1")) {
        return b;
      }
    }
  }
}
