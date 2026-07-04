package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085650 Least k such that 2^n+k is a brilliant number (A078972).
 * @author Sean A. Irvine
 */
public class A085650 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    long k = -1;
    while (true) {
      if (Predicates.BRILLIANT.is(mA.add(++k))) {
        return Z.valueOf(k);
      }
    }
  }
}
