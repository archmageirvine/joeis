package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A102815 "False so far" sequence.
 * @author Georg Fischer
 */
public class A102815 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.valueOf(11);
    }
    if (mN == 2) {
      mN = 20;
    } else if (mN == 100) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
