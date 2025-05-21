package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006702 Solution to a Pellian equation: least x such that x^2 - n*y^2 = +- 1.
 * @author Sean A. Irvine
 */
public class A006702 extends Sequence1 {

  protected long mN = 0;

  // solve x^2 - n * y^2 = +/- 1
  protected Q solve(final long n) {
    if (Predicates.SQUARE.is(n)) {
      return Q.ONE;
    }
    final CR sqrt = CR.valueOf(n).sqrt();
    final Convergents conv = new Convergents(sqrt);
    while (true) {
      final Q next = conv.next();
      final Z x = next.num();
      final Z y = next.den();
      final Z r = x.square().subtract(y.square().multiply(n)).abs();
      if (r.equals(Z.ONE)) {
        return next;
      }
    }
  }

  @Override
  public Z next() {
    return solve(++mN).num();
  }
}
