package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086545 Smallest k such that n*k+1 is a prime and (n-1)/k is noncomposite, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086545 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    for (final Z d : Jaguar.factor(mN - 1).divisorsSorted()) {
      final long k = d.longValue();
      if ((k == mN - 1 || Predicates.PRIME.is((mN - 1) / k)) && d.multiply(mN).add(1).isProbablePrime()) {
        return d;
      }
    }
    return Z.ZERO;
  }
}
