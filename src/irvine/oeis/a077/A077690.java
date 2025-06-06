package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A077690 Rearrangement of triangular numbers such that the most significant digits follow the cyclic pattern 1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,...
 * @author Sean A. Irvine
 */
public class A077690 extends Sequence1 {

  private int mN = -1;
  private final Sequence[] mS = {
    new A000217(),
    new A000217(),
    new A000217(),
    new A000217(),
    new A000217(),
    new A000217(),
    new A000217(),
    new A000217(),
    new A000217(),
  };

  @Override
  public Z next() {
    if (++mN >= mS.length) {
      mN = 0;
    }
    while (true) {
      final Z t = mS[mN].next();
      if (t.toString().charAt(0) == (char) ('1' + mN)) {
        return t;
      }
    }
  }
}
