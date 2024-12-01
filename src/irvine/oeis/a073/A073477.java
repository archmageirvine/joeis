package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000203;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A073477 Least k such that 2^n = k^2-sigma(k)*phi(k).
 * @author Sean A. Irvine
 */
public class A073477 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Sequence mSigma = new A000203();
  private final Sequence mPhi = new A000010();
  private long mM = 0;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final Z t = Z.valueOf(++mM).square().subtract(mSigma.next().multiply(mPhi.next()));
      if (t.bitCount() == 1) {
        final int v = t.bitLength() - 1;
        if (mFirsts.get(v) == 0) {
          mFirsts.set(v, mM);
          if (mVerbose) {
            StringUtils.message("Found " + v + " -> " + mM);
          }
        }
      }
      if (mVerbose && mM % 1000000 == 0) {
        StringUtils.message("Search completed to " + mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
