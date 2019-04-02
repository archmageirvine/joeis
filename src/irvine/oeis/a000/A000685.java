package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a047.A047863;

import java.util.ArrayList;

/**
 * A000685 Number of 3-colored labeled graphs on n nodes, divided by 3.
 * @author Sean A. Irvine
 */
public class A000685 extends A047863 {

  private final ArrayList<Z> mC = new ArrayList<>();

  {
    mC.add(super.next());
  }

  @Override
  public Z next() {
    mC.add(super.next());
    Z s = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      s = s.add(Binomial.binomial(mN, j).shiftLeft(j * (mN - j)).multiply(mC.get(j)));
    }
    return s.divide(3);
  }
}
