package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084006 Squares arising as a concatenation of k and 9's complement of k.
 * @author Sean A. Irvine
 */
public class A084006 extends Sequence1 {

  private long mN = 2;
  private long mMul = 10;

  private long ninesComplement(final long n) {
    return Functions.TENS_COMPLEMENT.l(n) - 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMul) {
        mMul *= 10;
      }
      final Z t = Z.valueOf(mN).multiply(mMul).add(ninesComplement(mN));
      if (Predicates.SQUARE.is(t)) {
        return t;
      }
    }
  }
}
