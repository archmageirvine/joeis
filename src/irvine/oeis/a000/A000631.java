package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A000631 Number of ethylene derivatives with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000631 extends A000642 {

  {
    setOffset(2);
  }

  private final ArrayList<Z> mA642 = new ArrayList<>();

  @Override
  public Z next() {
    do {
      mA642.add(super.next());
    } while (mN < 2);
    Z s = Z.ZERO;
    if ((mN & 1) == 0) {
      for (int k = 1; k < mN / 2; ++k) {
        s = s.add(mA642.get(k).multiply(mA642.get(mN - k)));
      }
      final Z f = mA642.get(mN / 2);
      s = s.add(f.multiply(f.add(1)).divide2());
    } else {
      for (int k = 1; k <= mN / 2; ++k) {
        s = s.add(mA642.get(k).multiply(mA642.get(mN - k)));
      }
    }
    return s;
  }
}

