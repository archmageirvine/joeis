package irvine.oeis.a052;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a006.A006202;

/**
 * A052263 Number of 5-colored labeled graphs on n nodes(divided by 1024).
 * @author Sean A. Irvine
 */
public class A052263 extends A006202 {

  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(null);
  }
  private int mN = 0;

  @Override
  public Z next() {
    mA.add(super.next());
    Z sum = Z.ZERO;
    ++mN;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mA.get(k)).shiftLeft(k * (mN - k)));
    }
    return sum.divide(80);
  }
}

