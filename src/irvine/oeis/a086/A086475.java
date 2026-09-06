package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086475 a(1) = 1 and then least squarefree number such that every partial concatenation of 2 or more terms is a prime.
 * @author Sean A. Irvine
 */
public class A086475 extends Sequence1 {

  private String mS = "1";
  private Z mK = null;

  @Override
  public Z next() {
    if (mK == null) {
      mK = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      mK = mK.add(2);
      if (Predicates.SQUARE_FREE.is(mK) && new Z(mS + mK).isProbablePrime()) {
        mS = mS + mK;
        return mK;
      }
    }
  }
}

