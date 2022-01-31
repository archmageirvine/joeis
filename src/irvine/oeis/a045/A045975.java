package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045975 Take the first odd integer and multiple of 1, the next 2 even integers and multiples of 2, the next 3 odd integers and multiples of 3, the next 4 even integers and multiples of 4, ...
 * @author Sean A. Irvine
 */
public class A045975 implements Sequence {

  private long mN = 1;
  private long mM = 1;
  private long mK = 0;
  private long mStep = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN++;
      mStep = (mN & 1) == 1 ? 2 * mN : mN;
      mK = mStep * (mK / mStep);
      if ((mN & 1) == 1 && (mK & 1) == 0) {
        mK += mN;
      }
    }
    mK += mStep;
    return Z.valueOf(mK);
  }
}
