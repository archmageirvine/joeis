package irvine.oeis.a054;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a049.A049310;

/**
 * A054450 Triangle of partial row sums of unsigned triangle A049310(n,m), n &gt;= m &gt;= 0 (Chebyshev S-polynomials).
 * @author Sean A. Irvine
 */
public class A054450 implements Sequence {

  private final Sequence mSeq = new A049310();
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
        final Z u = mSeq.next().abs();
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
