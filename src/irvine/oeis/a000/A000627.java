package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A000627.
 * @author Sean A. Irvine
 */
public class A000627 extends A000621 {

  private int mN = 0;
  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(null);
    mA.add(super.next());
  }

  @Override
  public Z next() {
    mA.add(super.next());
    ++mN;
    if ((mN & 1) == 0) {
      return mA.get(mN + 1).add(mA.get(mN / 2 + 1)).divide2();
    }
    if ((mN & 3) == 1) {
      return mA.get(mN + 1).add(mA.get(mN / 4 + 1)).divide2();
    }
    return mA.get(mN + 1).divide2();
  }
}
