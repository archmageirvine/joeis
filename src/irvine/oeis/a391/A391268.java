package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A391268 Smallest numbers k such that 2^k-1 when written in ternary contains its least significant zero in position n.
 * @author Sean A. Irvine
 */
public class A391268 extends Sequence0 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      Z t = Z.ONE.shiftLeft(++mM).subtract(1);
      int cnt = 0;
      while (!t.isZero()) {
        final Z[] qr = t.divideAndRemainder(Z.THREE);
        if (qr[1].isZero()) {
          if (mFirsts.get(cnt) == 0) {
            mFirsts.set(cnt, mM);
            if (mVerbose) {
              StringUtils.message("Solution for n=" + cnt + " is " + mM);
            }
          }
          break;
        }
        ++cnt;
        t = qr[0];
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
