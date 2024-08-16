package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A057325 First member of a prime quadruple in a p^2+p-1 progression.
 * @author Sean A. Irvine
 */
public class A057325 extends Sequence1 {

  private static final Sequence A000040 = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = A000040.next();
      final Z q = p.square().add(p).subtract(1);
      if (q.isProbablePrime()) {
        final Z r = q.square().add(q).subtract(1);
        if (r.isProbablePrime() && r.square().add(r).subtract(1).isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
