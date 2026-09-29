package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;

/**
 * A086712 Number of times the n-th prime power can be written as an arithmetic mean of two other prime powers.
 * @author Sean A. Irvine
 */
public class A086712 extends Sequence1 {

  private final DirectSequence mPP = DirectSequence.forceCreate(1, new A000961());

  @Override
  public Z next() {
    final Z t = mPP.next();
    final Z t2 = t.multiply2();
    long cnt = 0;
    long k = 0;
    while (true) {
      final Z u = mPP.a(++k);
      if (u.equals(t)) {
        return Z.valueOf(cnt);
      }
      if (Predicates.PRIME_POWER.is(t2.subtract(u))) {
        ++cnt;
      }
    }
  }
}
