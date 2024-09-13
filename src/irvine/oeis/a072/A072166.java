package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072166 Triangle in which first row is {1}; to get n-th row take first n numbers greater than last number in previous row which are congruent to 1 (mod n).
 * @author Sean A. Irvine
 */
public class A072166 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mT = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
    }
    while (++mT % mN != 1) {
      // do nothing
    }
    return Z.valueOf(mT);
  }
}
