package irvine.oeis.a059;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001678;

/**
 * A059123 Number of homeomorphically irreducible rooted trees (also known as series-reduced rooted trees, or rooted trees without nodes of degree 2) with n &gt;= 1 nodes.
 * @author Sean A. Irvine
 */
public class A059123 extends Sequence0 {

  private final A001678 mA1678 = new A001678();
  private final ArrayList<Z> mSeq = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mSeq.add(mA1678.next()); // 0
      mSeq.add(mA1678.next()); // 0
      mSeq.add(mA1678.next()); // x^2
      mSeq.add(mA1678.next()); // 0
    }
    mSeq.add(mA1678.next());
    Z r = mSeq.get(mN).add(mSeq.get(mN + 1)).multiply2();
    if ((mN & 1) != 0) {
      r = r.subtract(mSeq.get(mN / 2 + 1));
    }
    for (int k = 1; k <= mN + 1; ++k) {
      r = r.subtract(mSeq.get(k).multiply(mSeq.get(mN + 1 - k)));
    }
    return r.divide2();
  }
}

