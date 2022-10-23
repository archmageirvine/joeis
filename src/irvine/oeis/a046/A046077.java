package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A046077 a(d-2) is the smallest member of A046076 containing an undulating sequence of 010... or 101... of maximal length d=3, 4, ...
 * @author Sean A. Irvine
 */
public class A046077 extends Sequence1 {

  private int mN = 102;
  private Z mA = Z.ONE.shiftLeft(mN);
  private final DynamicIntArray mFirsts = new DynamicIntArray();
  private int mM = 2;

  private int maxUndulate(Z n) {
    int max = 0;
    int cnt = 0;
    long expected = 10;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final long r = qr[1].longValue();
      if (r == expected) {
        if (++cnt > max) {
          max = cnt;
        }
        expected = 1 - r;
      } else {
        if (r > 1) {
          expected = 10;
          cnt = 0;
        } else {
          expected = 1 - r;
          cnt = 1;
        }
      }
      n = qr[0];
    }
    return Math.max(max, cnt);
  }

  @Override
  public Z next() {
    ++mM;
    while (mFirsts.get(mM) == 0) {
      ++mN;
      mA = mA.multiply2();
      final int max = maxUndulate(mA);
      //System.out.println(mN + " " + max);
      if (mFirsts.get(max) == 0) {
        mFirsts.set(max, mN);
      }
    }
    return Z.valueOf(mFirsts.get(mM));
  }
}
