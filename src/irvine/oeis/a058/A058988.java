package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058988 For a rational number p/q let f(p/q) = p*q divided by number of divisors of p+q; a(n) is obtained by iterating f, starting at n/1, until an integer is reached, or if no integer is ever reached then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A058988 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Q f = new Q(++mN);
    while (true) {
      final Q prev = f;
      final Z g = f.num().add(f.den());
      final FactorSequence fs = Jaguar.factor(g);
      f = new Q(f.num().multiply(f.den()), fs.sigma0());
      if (f.isInteger()) {
        return f.toZ();
      }
      if (f.equals(prev)) {
        return Z.ZERO;
      }
    }
  }
}
