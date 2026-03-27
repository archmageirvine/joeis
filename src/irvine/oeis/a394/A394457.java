package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a006.A006972;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A393561 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A394457 extends Sequence3 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private final Sequence mCarmichael = new A006972();
  private int mN = 2;

  private int count(final Z c) {
    final FactorSequence fs = Jaguar.factor(c);
    int cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (p.mod(4) != 1) {
        return 0;
      }
      cnt += fs.getExponent(p);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z c = mCarmichael.next();
      final int cnt = count(c);
      if (mFirsts.get(cnt) == null) {
        mFirsts.set(cnt, c);
        if (mVerbose) {
          StringUtils.message("Solution for " + cnt + " is " + c);
        }
      }
    }
    return mFirsts.get(mN);
  }
}
