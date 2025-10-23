package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005422;
import irvine.oeis.a061.A061075;

/**
 * A081317 Primes p such that p divides 10^n-1, p is the largest prime producing decimal fraction period n and p is not the largest prime dividing 10^n-1.
 * @author Sean A. Irvine
 */
public class A081317 extends Sequence1 {

  private final Sequence mA = new A061075();
  private final Sequence mB = new A005422();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA.next();
      final Z q = mB.next();
      if (!p.equals(q)) {
        return p;
      }
    }
  }
}

