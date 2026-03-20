package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084216 a(n) = smallest integer d such that a quadratic representation 2n+1 = x^2 + d*y^2 exists (x,y positive integers).
 * @author Sean A. Irvine
 */
public class A084216 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    long d = 0;
    while (true) {
      ++d;
      for (long y = 1; d * y * y < mN; ++y) {
        final long x2 = mN - d * y * y;
        if (Predicates.SQUARE.is(x2)) {
          //System.out.println(mN + " " + Functions.SQRT.l(x2) + " + " + d + " * " + y);
          return Z.valueOf(d);
        }
      }
    }
  }
}
