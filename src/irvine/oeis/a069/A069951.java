package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A069951 Continued fraction expansion of the number e^(2/3).
 * If k&gt;0 a(5k)=a(5k+1)=1, a(5k+2)=9k+1, a(5k+3)=36k+18, a(5k+4)=9k+7.
 * @author Georg Fischer
 */
public class A069951 implements Sequence {

  private int mN = 0;
  private long mK;

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ONE;
    if (mN == 0) {
      mK = -1;
      return result;
    }
    switch (mN % 5) {
      case 1:
        break;
      case 2:
        result = Z.valueOf(9 * mK + 1);
        break;
      case 3:
        result = Z.valueOf(36 * mK + 18);
        break;
      case 4:
        result = Z.valueOf(9 * mK + 7);
        break;
      case 0:
      default:
        ++mK;
        break;
    }
    return result;
  }
}
