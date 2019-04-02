package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A000686 Number of 4-colored labeled graphs on n nodes, divided by 4.
 * @author Sean A. Irvine
 */
public class A000686 extends A000685 {

  private final ArrayList<Z> mC = new ArrayList<>();
  {
    mC.add(Z.ONE);
  }

  @Override
  public Z next() {
    mC.add(super.next().multiply(3));
    Z s = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      s = s.add(Binomial.binomial(mN, j).shiftLeft(j * (mN - j)).multiply(mC.get(j)));
    }
    return s.shiftRight(2);
  }
}
