package irvine.oeis.a387;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387305 Least k such that the Hamming weight (A000120) of n*k is prime.
 * @author Sean A. Irvine
 */
public class A387305 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      if (Predicates.PRIME.is(mN.multiply(++k).bitCount())) {
        return Z.valueOf(k);
      }
    }
  }
}

