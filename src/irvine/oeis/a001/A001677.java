package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000084;

/**
 * A001677 Number of series-parallel networks with n edges.
 * @author Sean A. Irvine
 */
public class A001677 extends A000084 {

  private final ArrayList<Z> mA84 = new ArrayList<>();
  {
    mA84.add(super.next());
  }

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    mA84.add(t);
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      s = s.add(mA84.get(k).multiply(mA84.get(mN - 1 - k)));
    }
    if ((mN & 1) != 0) {
      s = s.add(mA84.get(mN / 2));
    }
    return t.subtract(s.divide(2));
  }
}
