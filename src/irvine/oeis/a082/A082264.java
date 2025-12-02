package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082264 Triangle whose n-th row contains n smallest palindromes with a digit sum of n.
 * @author Sean A. Irvine
 */
public class A082264 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private Sequence mP = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mP = new A002113();
    }
    while (true) {
      final Z p = mP.next();
      if (Functions.DIGIT_SUM.l(p) == mN) {
        return p;
      }
    }
  }
}
