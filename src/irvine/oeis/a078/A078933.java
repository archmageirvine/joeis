package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078933 Good examples of Hall's conjecture: integers x such that 0 &lt; |x^3 - y^2| &lt; sqrt(x) for some integer y.
 * @author Sean A. Irvine
 */
public class A078933 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.SQUARE.is(++mN)) {
        final Z n = Z.valueOf(mN);
        final Z n3 = n.pow(3);
        final CR x3 = CR.valueOf(n3);
        final CR t = x3.subtract(x3.sqrt().round().square()).abs();
        if (t.compareTo(CR.valueOf(mN).sqrt()) < 0) {
          return n;
        }
      }
    }
  }
}
