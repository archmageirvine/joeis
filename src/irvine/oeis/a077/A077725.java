package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.Sequence2;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077725 a(n) = smallest square &gt; 1 which can be expressed as a sum of distinct powers of n.
 * @author Sean A. Irvine
 */
public class A077725 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return new FilterSequence(new DistinctAdditiveClosureSequence(new Sequence0() {
      private Z mA = null;
      @Override
      public Z next() {
        mA = mA == null ? Z.ONE : mA.multiply(mN);
        return mA;
      }
    }), Predicates.SQUARE::is).skip(2).next();
  }
}
