package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343082.
 * @author Sean A. Irvine
 */
public class A343082 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.valueOf(811538);
    } else if (mN == 4) {
      return Z.valueOf(16578);
    } else if (mN == 5) {
      return Z.valueOf(4225);
    } else if (mN <= 7) {
      return Z.valueOf(mN + 2670);
    } else if (mN <= 16) {
      return Z.valueOf(mN + 510);
    } else {
      return Z.valueOf(mN + 255);
    }
  }
}
