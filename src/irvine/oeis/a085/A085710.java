package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085710 Smallest k such that kn+1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A085710 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    Z t = Z.valueOf(mN + 1);
    while (!Predicates.SEMIPRIME.is(t)) {
      ++k;
      t = t.add(mN);
    }
    return Z.valueOf(k);
  }
}
