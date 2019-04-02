package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000137 Series-parallel numbers.
 * @author Sean A. Irvine
 */
public class A000137 implements Sequence {

  private final A000084 mS84 = new A000084();
  private final ArrayList<Z> mA84 = new ArrayList<>();
  private final ArrayList<Z> mA137 = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    mA84.add(mS84.next());
    if (++mN == 0) {
      mA137.add(Z.TWO);
      return Z.ONE;
    }
    Z r = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      r = r.add(mA137.get(k).multiply(mA84.get(mN - k - 1)));
    }
    mA137.add(r);
    return r;
  }
}

