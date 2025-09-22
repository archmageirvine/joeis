package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A080472 a(n) = smallest triangular number that is obtained by placing digits anywhere in n; a(n) = n if n is a triangular number.
 * @author Sean A. Irvine
 */
public class A080472 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence f = new A000217();
    while (true) {
      final Z t = f.next();
      if (A080471.is(t, mN)) {
        return t;
      }
    }
  }
}

