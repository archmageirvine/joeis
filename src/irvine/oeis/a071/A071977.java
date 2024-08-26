package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071977 Triangle in which first row is {1}; to get n-th row take first n numbers greater than last number in previous row which are relatively prime to n.
 * @author Sean A. Irvine
 */
public class A071977 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long mA = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
    }
    while (Functions.GCD.l(mN, ++mA) > 1) {
      // do nothing
    }
    return Z.valueOf(mA);
  }
}
