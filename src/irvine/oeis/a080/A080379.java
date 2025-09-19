package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A080379 Least n such that n consecutive values in A080378 equals 2; i.e., exactly n differences between consecutive primes give residues 2 when divided by 4.
 * @author Sean A. Irvine
 */
public class A080379 extends A080378 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      Z t;
      do {
        ++mM;
        t = super.next();
      } while (!Z.TWO.equals(t));
      long cnt = 0;
      do {
        ++cnt;
        ++mM;
        t = super.next();
      } while (Z.TWO.equals(t));
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM - cnt);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
