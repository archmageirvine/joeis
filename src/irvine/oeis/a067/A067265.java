package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002321;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067265 extends A000040 {

  private long mN = 0;
  private Z mP = super.next();
  private final Sequence mMertens = new A002321();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mP;
      mP = super.next();
      if (mP.subtract(t).equals(mMertens.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

