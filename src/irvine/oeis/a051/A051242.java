package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicLongArray;

/**
 * A051242 Array T by antidiagonals; T(n,k)=k-th binary number d(1),...,d(j) for which exactly n digits d(i) satisfy d(i)=d(j+1-i) (n=0,1,2,...; k=1,2,3,..).
 * @author Sean A. Irvine
 */
public class A051242 implements Sequence {

  private DynamicArray<DynamicLongArray> mA = new DynamicArray<>();
  private int mN = -1;
  private int mM = 0;
  private long mR = 0;

  private long get(final int n, final int m) {
    final DynamicLongArray a = mA.get(n);
    if (a == null) {
      return 0;
    }
    return a.get(m);
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    while (get(mN - mM, mM) == 0) {
      final String s = Long.toBinaryString(++mR);
      int cnt = 0;
      for (int i = 0; i < s.length(); ++i) {
        if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
          ++cnt;
        }
      }
      final DynamicLongArray a = mA.get(cnt);
      if (a == null) {
        final DynamicLongArray t = new DynamicLongArray();
        t.set(0, mR);
        mA.set(cnt, t);
      } else {
        a.set(a.length(), mR);
      }
    }
    return Z.valueOf(get(mN - mM, mM));
  }
}
