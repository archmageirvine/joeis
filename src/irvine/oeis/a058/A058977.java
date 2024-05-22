package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058977 For a rational number p/q let f(p/q) = sum of distinct prime factors (A008472) of p+q divided by number of distinct prime factors (A001221) of p+q; a(n) is obtained by iterating f, starting at n/1, until an integer is reached, or if no integer is ever reached then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A058977 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Q f = new Q(++mN);
      while (true) {
        final Q prev = f;
        final Z g = f.num().add(f.den());
        final FactorSequence fs = Jaguar.factor(g);
        f = new Q(Functions.SUM.z(fs.toZArray()), Z.valueOf(fs.omega()));
        if (f.isInteger()) {
          return f.toZ();
        }
        if (f.equals(prev)) {
          break;
        }
      }
    }
  }
}
