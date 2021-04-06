package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343078 a(n) = smallest number that is the sum of n positive 5th powers in two ways.
 * @author Sean A. Irvine
 */
public class A343078 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.valueOf(1375298099);
    } else if (mN == 4) {
      return Z.valueOf(51445);
    } else if (mN <= 32) {
      return Z.valueOf(mN + 4092);
    } else {
      return Z.valueOf(mN + 1023);
    }
  }
}
