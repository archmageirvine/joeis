package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033918 Triangular array in which n-th row consists of the numbers 1^1, 2^2, ... n^n.
 * @author Sean A. Irvine
 */
public class A033918 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM).pow(mM);
  }
}
