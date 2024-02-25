package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.util.string.English;
import irvine.util.string.StringUtils;

/**
 * A068569 Positive numbers that are not the ratio of any n/(number of letters to express n in English).
 * @author Sean A. Irvine
 */
public class A068569 extends Sequence1 implements Conjectural {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashSet<Integer> mForbidden = new HashSet<>();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mForbidden.size() < 2 * mN) {
        final int len = English.SINGLETON.toRawText(++mM).length();
        if (mM % len == 0) {
          final int r = mM / len;
          if (r < mN && !mForbidden.contains(r)) {
            throw new RuntimeException("Previously output " + r + " was an error");
          }
          if (mForbidden.add(r) && mVerbose) {
            StringUtils.message(r + " eliminated by " + mM);
          }
        }
      }
      if (!mForbidden.contains(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
