package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A002772 Number of terms in a bordered skew determinant.
 * @author Sean A. Irvine
 */
public class A002772 extends A002771 {

  private final ArrayList<Z> mSkew = new ArrayList<>();
  {
    mSkew.add(Z.ONE); // easier to keep indexes in sync
    mSkew.add(super.next());
  }
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    mSkew.add(super.next());
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(mSkew.get(mN - k).multiply(f));
      f = f.multiply(mN - k);
    }
    return s;
  }
}
