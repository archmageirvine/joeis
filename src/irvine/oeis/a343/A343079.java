package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A343079.
 * @author Sean A. Irvine
 */
public class A343079 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.valueOf(160426514);
    } else if (mN <= 5) {
      return Z.valueOf(mN + 1063006);
    } else if (mN <= 7) {
      return Z.valueOf(mN + 570941);
    } else if (mN <= 9) {
      return Z.valueOf(mN + 63224);
    } else if (mN <= 12) {
      return Z.valueOf(mN + 52479);
    } else if (mN <= 17) {
      return Z.valueOf(mN + 16380);
    } else if (mN <= 34) {
      return Z.valueOf(mN + 13104);
    } else if (mN <= 39) {
      return Z.valueOf(mN + 8190);
    } else if (mN <= 64) {
      return Z.valueOf(mN + 6552);
    } else {
      return Z.valueOf(mN + 4095);
    }
  }
}
