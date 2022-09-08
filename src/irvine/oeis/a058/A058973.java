package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058973 First integer reached in A058972.
 * @author Sean A. Irvine
 */
public class A058973 implements Sequence {

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
          return f.toZ();
        }
        if (f.equals(prev)) {
          break;
        }
      }
    }
  }
}
