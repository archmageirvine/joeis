package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343080 a(n) is the smallest number that is the sum of n positive squares in three ways.
 * @author Sean A. Irvine
 */
public class A343080 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.valueOf(325);
    } else if (mN == 3) {
      return Z.valueOf(54);
    } else {
      return Z.valueOf(mN + 24);
    }
  }
}
