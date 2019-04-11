package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A147808 Sum of n-digit numbers which are balanced: the first <code>[n/2]</code> digits have the same sum as the last <code>[n/2]</code> digits.
 * @author Sean A. Irvine
 */
public class A147808 implements Sequence {

  private int mN = 0;
  private Z[] mS1 = {Z.ZERO, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE};
  private Z[] mT1 = {Z.ZERO, Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX, Z.SEVEN, Z.EIGHT, Z.NINE};
  private Z[] mS2 = {Z.ONE};
  private Z[] mT2 = {Z.ZERO};

  private Z[] expandS(final Z[] s, final int start) {
    final Z[] res = new Z[s.length + 9];
    Arrays.fill(res,  Z.ZERO);
    for (int k = start; k < s.length; ++k) {
      for (int j = 0; j < 10; ++j) {
        res[k + j] = res[k + j].add(s[k]);
      }
    }
    return res;
  }

  private Z[] expandT(final Z[] t, final Z[] s, final int start) {
    final Z[] res = new Z[t.length + 9];
    Arrays.fill(res,  Z.ZERO);
    for (int k = start; k < t.length; ++k) {
      for (int j = 0; j < 10; ++j) {
        res[k + j] = res[k + j].add(t[k].multiply(Z.TEN).add(s[k].multiply(j)));
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(45);
    }
    final int m = mN / 2;
    final int dlen = m * 9;
    if (mT1.length < dlen) {
      mT1 = expandT(mT1, mS1, 1);
      mS1 = expandS(mS1, 1);
    }
    if (mS2.length < dlen) {
      mT2 = expandT(mT2, mS2, 0);
      mS2 = expandS(mS2, 0);
    }
    Z s = Z.ZERO;
    final Z e = Z.TEN.pow(m);
    if ((mN & 1) == 0) {
      for (int k = 0; k < mS1.length && k < mS2.length; ++k) {
        s = s.add(e.multiply(mT1[k]).multiply(mS2[k]));
        s = s.add(mT2[k].multiply(mS1[k]));
      }
    } else {
      for (int k = 0; k < mS1.length && k < mS2.length; ++k) {
        final Z t = mT1[k].multiply(100).add(mS1[k].multiply(45));
        s = s.add(t.multiply(e).multiply(mS2[k]));
        s = s.add(Z.TEN.multiply(mT2[k]).multiply(mS1[k]));
      }
    }
    return s;
  }
}
