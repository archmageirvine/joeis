package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393495 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A393495 extends Sequence1 {

  private long mN = 4156;

  @Override
  public Z next() {
    while (true) {
      if (A393492.is(++mN) && A393492.is(mN + 1) && A393492.is(mN + 2) && A393492.is(mN + 3)) {
        return Z.valueOf(mN);
      }
    }
  }
}
