package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000206 Even sequences with period 2n.
 * @author Sean A. Irvine
 */
public class A000206 implements Sequence {

  private int mN = -1;
  private final A000011 mStep1 = new A000011();
  private final A000011 mStep2 = new A000011();

  @Override
  public Z next() {
    if (++mN == 0) {
      mStep1.next();
      mStep2.next();
      return Z.ONE;
    } else {
      mStep2.next();
      final Z u = mStep2.next();
      final Z v = mStep1.next();
      if ((mN & 1) == 0) {
        return u.add(v)
          .add(Z.ONE.shiftLeft(mN - 2))
          .subtract(Z.ONE.shiftLeft(mN / 2 - 1))
          .divide2();
      } else {
        return u.divide2();
      }
    }
  }
}

