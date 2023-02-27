package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061657 In base 3 n and n^2 contain the same digits in the same proportion.
 * @author Sean A. Irvine
 */
public class A061657 extends Sequence1 {

  private final int mBase;
  private Z mN;

  protected A061657(final int base) {
    mBase = base;
    mN = Z.valueOf(base);
  }

  /** Construct the sequence. */
  public A061657() {
    this(3);
  }

  private boolean is(final Z n) {
    final int[] c1 = ZUtils.digitCounts(n, mBase);
    final int[] c2 = ZUtils.digitCounts(n.square(), mBase);
    int r = 0;
    for (int k = 0; k < c1.length; ++k) {
      if (c1[k] == 0) {
        if (c2[k] != 0) {
          return false;
        }
      } else if (c2[k] == 0) {
        return false;
      } else if (c2[k] % c1[k] != 0) {
        return false;
      } else if (r > 0) {
        if (c2[k] / c1[k] != r) {
          return false;
        }
      } else {
        r = c2[k] / c1[k];
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}

