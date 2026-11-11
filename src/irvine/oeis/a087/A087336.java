package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087336 a(1) = 7, then smallest number such that every partial product + 1 is a cube.
 * @author Sean A. Irvine
 */
public class A087336 extends Sequence1 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    long k = 2;
    while (!Predicates.CUBE.is(mProd.multiply(k).add(1))) {
      ++k;
    }
    mProd = mProd.multiply(k);
    return Z.valueOf(k);
  }
}

