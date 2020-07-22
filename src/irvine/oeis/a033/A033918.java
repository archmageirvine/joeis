package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033918 Triangular array in which n-th row consists of the numbers <code>1^1, 2^2, ... n^n</code>.
 * @author Sean A. Irvine
 */
public class A033918 implements Sequence {

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
