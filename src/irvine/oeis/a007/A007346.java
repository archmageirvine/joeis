package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007346.
 * @author Sean A. Irvine
 */
public class A007346 implements Sequence {

  private int mN = 0;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    switch (++mN) {
      case 1:
        return Z.TWO;
      case 2:
        return Z.EIGHT;
      case 6:
        return Z.valueOf(7680);
      case 12:
        return Z.valueOf(194641920);
      default:
        break;
    }
    if ((mN & 1) == 1) {
      return mF.factorial(mN).shiftLeft(mN - 1);
    } else if ((mN & 3) == 2) {
      return mF.factorial(mN).shiftLeft(mN);
    } else {
      int np = mN;
      int k = 1;
      while ((np & 1) == 0) {
        np >>>= 1;
        ++k;
      }
      if (mN == 1 << (k - 1)) {
        return Z.valueOf(k).shiftLeft(k);
      } else {
        return mF.factorial(mN).shiftLeft(mN - 2);
      }
    }
  }
}
