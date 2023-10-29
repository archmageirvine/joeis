package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a212.A212796;

/**
 * A066543 Number of spanning trees in the line graph of the product of two cycle graphs, each of order n, L(C_n x C_n).
 * @author Sean A. Irvine
 */
public class A066543 extends A212796 {

  private long mN = 2;
  {
    setOffset(3);
  }

  @Override
  public Z next() {
    return numberOfSpanningTrees(++mN, mN).shiftLeft(3 * mN * mN - 1);
  }
}
