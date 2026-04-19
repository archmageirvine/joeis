package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084476 Least k such that 10^(2n-1)+k is a brilliant number.
 * @author Sean A. Irvine
 */
public class A084476 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long k = -1;
    final Z t = Z.TEN.pow(mN);
    while (true) {
      if (Predicates.BRILLIANT.is(t.add(++k))) {
        return Z.valueOf(k);
      }
    }
  }
}
