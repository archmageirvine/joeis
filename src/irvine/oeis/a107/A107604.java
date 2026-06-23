package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A107604 Order of appearance of twos in the Fibonacci substitution :triangular in form.
 * @author Sean A. Irvine
 */
public class A107604 extends Sequence0 {

  private final LongDynamicByteArray mS = new LongDynamicByteArray();
  private long mM = 0;
  private long mR = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mR) {
        if (mS.length() == 0) {
          mS.set(0, (byte) 1);
          mS.set(1, (byte) 2);
        } else {
          mS.set(mS.length(), (byte) 1);
          if (mS.get(mR) == 1) {
            mS.set(mS.length(), (byte) 2);
          }
          ++mR;
        }
        mM = 0;
      }
      if (mS.get(mM) == 2) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}
