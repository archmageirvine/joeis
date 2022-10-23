package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014414 Odd elements in Pascal's triangle that are not 1.
 * @author Sean A. Irvine
 */
public class A014414 extends Sequence1 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      final Z b = Binomial.binomial(mN, mM);
      if (b.isOdd()) {
        return b;
      }
    }
  }
}
