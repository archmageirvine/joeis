package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087334 a(1) = 3, then smallest number such that every partial product + 1 is a distinct square.
 * @author Sean A. Irvine
 */
public class A087334 extends Sequence1 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    long k = 2;
    while (!Predicates.SQUARE.is(mProd.multiply(k).add(1))) {
      ++k;
    }
    mProd = mProd.multiply(k);
    return Z.valueOf(k);
  }
}

