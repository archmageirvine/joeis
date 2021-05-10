package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002432;

/**
 * A046988 Numerators of zeta(2*n)/Pi^(2*n).
 * @author Sean A. Irvine
 */
public class A046988 extends A002432 {

  private boolean mFirst = true;

  @Override
  protected Z select(final Q n) {
    if (mFirst) {
      mFirst = false;
      return Z.NEG_ONE;
    }
    return n.num().abs();
  }
}
