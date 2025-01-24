package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074661 Let n = 2^e_2 * 3^e_3 * 5^e_5 * ... be the prime factorization of n; sequence gives n such that max{e_2, e_3, ...} is prime.
 * @author Sean A. Irvine
 */
public class A074661 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PRIME.is(Jaguar.factor(++mN).maxExponent())) {
        return Z.valueOf(mN);
      }
    }
  }
}
