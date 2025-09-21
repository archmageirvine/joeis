package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A080454.
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

