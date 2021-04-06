package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343077 a(n) = smallest number that is the sum of n positive 4th powers in two ways.
 * @author Sean A. Irvine
 */
public class A343077 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.valueOf(635318657);
    } else if (mN == 3) {
      return Z.valueOf(2673);
    } else if (mN <= 15) {
      return Z.valueOf(mN + 255);
    } else {
      return Z.valueOf(mN + 240);
    }
  }
}
