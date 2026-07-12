package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085818 For n &gt; 1: a(n) = p if n = p^e with p prime and e &gt; 1, otherwise a(n) = (n-m)-th prime, where m = number of nonprime prime powers &lt;= n; a(1)=1.
 * @author Sean A. Irvine
 */
public class A085818 extends Sequence1 {

  // After Michel Marcus

  private long mN = 0;
  private long mF = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (!Predicates.PRIME.is(mN) && Predicates.PRIME_POWER.is(mN)) {
      ++mF;
      return Jaguar.factor(mN).toZArray()[0];
    }
    return Functions.PRIME.z(mN - mF);
  }
}
