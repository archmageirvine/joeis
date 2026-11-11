package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087337 Cubes pertaining to A087336. a(n) = n-th partial product of A087336 + 1.
 * @author Sean A. Irvine
 */
public class A087337 extends Sequence1 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    long k = 2;
    while (!Predicates.CUBE.is(mProd.multiply(k).add(1))) {
      ++k;
    }
    mProd = mProd.multiply(k);
    return mProd.add(1);
  }
}

