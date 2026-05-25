package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000129;

/**
 * A084971.
 * @author Sean A. Irvine
 */
public class A395408 extends Sequence1 {

  private final Sequence mPell = new A000129();

  @Override
  public Z next() {
    while (true) {
      final Z t = mPell.next().square().subtract(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
