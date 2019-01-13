package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A006350.
 * @author Sean A. Irvine
 */
public class A006350 extends A006349 {

  private final ArrayList<Z> mT = new ArrayList<>();
  {
    mT.add(Z.ZERO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    mT.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(mT.get(mN - k).multiply(mS.get(k)));
    }
    return sum;
  }
}

