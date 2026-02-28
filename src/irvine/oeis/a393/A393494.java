package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393494 Starts of runs of 3 consecutive integers that are all s-practical numbers (A393492).
 * @author Sean A. Irvine
 */
public class A393494 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (A393492.is(++mN) && A393492.is(mN + 1) && A393492.is(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
