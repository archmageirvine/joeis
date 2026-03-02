package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084004 Squares obtained as a concatenation of k and 10's complement of k.
 * @author Sean A. Irvine
 */
public class A084004 extends Sequence1 {

  private long mN = 5;
  private long mMul = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMul) {
        mMul *= 10;
      }
      final Z t = Z.valueOf(mN).multiply(mMul).add(Functions.TENS_COMPLEMENT.z(mN));
      if (Predicates.SQUARE.is(t)) {
        return t;
      }
    }
  }
}
