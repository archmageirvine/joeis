package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006886 Kaprekar numbers: positive numbers n such that <code>n =</code> q+r and <code>n^2 =</code> q*10^m+r, for some m <code>&gt;= 1</code>, q <code>&gt;= 0</code> and <code>0 &lt;=</code> r &lt; 10^m, with <code>n != 10^a, a &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A006886 implements Sequence {

  private long mN = 0;
  private long mSkip = 10;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (++mN == mSkip) {
        mSkip *= 10;
        continue;
      }
      final Z n = Z.valueOf(mN);
      final String s = n.square().toString();
      for (int k = 1; k < s.length(); ++k) {
        if (Long.parseLong(s.substring(0, k)) + Long.parseLong(s.substring(k)) == mN) {
          return n;
        }
      }
    }
  }
}
