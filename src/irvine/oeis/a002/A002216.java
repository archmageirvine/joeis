package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002216 Harary-Read numbers: restricted hexagonal polyominoes (cata-polyhexes) with n cells.
 * @author Sean A. Irvine
 */
public class A002216 extends A002215 {

  private final Sequence mA002214 = new A002214();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().add(mA002214.next()).divide2();
  }
}
