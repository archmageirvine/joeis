package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343081.
 * @author Sean A. Irvine
 */
public class A343081 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.valueOf(5104);
    } else if (mN == 3) {
      return Z.valueOf(mN + 1225);
    } else if (mN == 4) {
      return Z.valueOf(mN + 766);
    } else if (mN <= 9) {
      return Z.valueOf(mN + 215);
    } else if (mN == 10) {
      return Z.valueOf(mN + 197);
    } else if (mN <= 14) {
      return Z.valueOf(mN + 152);
    } else {
      return Z.valueOf(mN + 124);
    }
  }
}
