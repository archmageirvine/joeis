package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343081 a(n) is the smallest number that is the sum of n positive cubes in three ways.
 * @author Sean A. Irvine
 */
public class A343081 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.valueOf(5104);
    } else if (mN == 4) {
      return Z.valueOf(1225);
    } else if (mN == 5) {
      return Z.valueOf(766);
    } else if (mN <= 9) {
      return Z.valueOf(mN + 215);
    } else if (mN == 10) {
      return Z.valueOf(197);
    } else if (mN <= 14) {
      return Z.valueOf(mN + 152);
    } else {
      return Z.valueOf(mN + 124);
    }
  }
}
