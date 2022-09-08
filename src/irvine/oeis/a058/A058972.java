package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058972 For a rational number p/q let f(p/q) = sum of aliquot divisors of p+q divided by number of divisors of p+q; sequence gives numbers k such that, starting at k/1 and iterating f, an integer is eventually reached.
 * @author Sean A. Irvine
 */
public class A058972 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Q f = new Q(++mN);
      while (true) {
        final Q prev = f;
        final Z g = f.num().add(f.den());
        final FactorSequence fs = Jaguar.factor(g);
        f = new Q(fs.sigma().subtract(g), fs.sigma0());
        if (f.isInteger()) {
          return Z.valueOf(mN);
        }
        if (f.equals(prev)) {
          break;
        }
      }
    }
  }
}
