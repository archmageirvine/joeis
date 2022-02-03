package irvine.oeis.a054;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A054448 Triangle of partial row sums of triangle A054446(n,m), n &gt;= m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A054448 extends A054446 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;
  private Z mT = Z.ZERO;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      ++mN;
      mT = Z.ZERO;
      for (int k = 0; k < mN; ++k) {
        final Z u = super.next();
        mT = mT.add(u);
        mA.add(u);
      }
      mM = 0;
    }
    final Z res = mT;
    mT = mT.subtract(mA.get(mM));
    return res;
  }
}
