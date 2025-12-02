package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082265 n-th largest palindrome whose digit sum is n.
 * @author Sean A. Irvine
 */
public class A082265 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence palin = new A002113();
    Z p = null;
    for (long m = 0; m < mN; ++m) {
      do {
        p = palin.next();
      } while (Functions.DIGIT_SUM.l(p) != mN);
    }
    return p;
  }
}
