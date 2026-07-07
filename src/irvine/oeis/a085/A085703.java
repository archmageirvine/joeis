package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085703 a(1)=4, then least semiprime &gt; a(n-1) such that when all in the sequence are concatenated together they form a prime.
 * @author Sean A. Irvine
 */
public class A085703 extends Sequence1 {

  private String mS = "4";
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
      return Z.FOUR;
    }
    while (true) {
      mA = mA.add(1);
      final String t = mS + mA;
      if (new Z(t).isProbablePrime() && Predicates.SEMIPRIME.is(mA)) {
        mS = t;
        return mA;
      }
    }
  }
}
