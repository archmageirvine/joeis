package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066182 Permutation of the integers with cycle form {1}, {3, 2}, {6, 5, 4}, {10, 9, 8, 7}, ...
 * @author Sean A. Irvine
 */
public class A066182 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mU = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      ++mU;
      return Z.valueOf(mU + mN);
    }
    return Z.valueOf(++mU);
  }
}
