package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066181 Permutation of the integers with cycle form {1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}, ...
 * @author Sean A. Irvine
 */
public class A066181 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;
  private long mU = 1;
  private long mV = 1;

  @Override
  public Z next() {
    if (++mM == mN) {
      ++mN;
      mM = 0;
      final Z res = Z.valueOf(mV);
      mV = ++mU;
      return res;
    }
    return Z.valueOf(++mU);
  }
}
