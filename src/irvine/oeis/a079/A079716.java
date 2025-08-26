package irvine.oeis.a079;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000071;
import irvine.oeis.a005.A005968;

/**
 * A079716 a(p)=2*(F(1)^3+F(2)^3+F(3)^3+....+F(p)^3)/(F(1)+F(2)+F(3)+....+F(p)) where p runs through the primes and F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A079716 extends Sequence1 {

  private final Sequence mA = new A005968().skip();
  private final Sequence mB = new A000071().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = mA.next();
      final Z t = mB.next();
      if (Predicates.PRIME.is(++mN)) {
        return s.multiply2().divide(t);
      }
    }
  }
}

