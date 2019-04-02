package irvine.oeis.a224;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a213.A213441;

/**
 * A224068 Number of labeled graphs on n vertices that can be colored using exactly 4 colors.
 * @author Sean A. Irvine
 */
public class A224068 extends A213441 {

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
    for (int k = 2; k < mN - 1; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mA.get(k)).multiply(mA.get(mN - k)).shiftLeft(k * (mN - k)));
    }
    return sum;
  }
}

