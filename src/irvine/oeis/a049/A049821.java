package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a002.A002859;

/**
 * A049821 a(n) = j + k, where u(n) = u(j) + u(k) is the unique sum of Ulam numbers described in A002859 (with 1 &lt;= j &lt; k &lt; n).
 * @author Sean A. Irvine
 */
public class A049821 extends A002859 {

  // This is not done efficiently

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    for (int k = mSeq.size() - 2; k >= 0; --k) {
      final Z r = t.subtract(mSeq.get(k));
      for (int j = k - 1; j >= 0; --j) {
        final int c = r.compareTo(mSeq.get(j));
        if (c >= 0) {
          if (c == 0) {
            return Z.valueOf(k + j + 2);
          }
          break;
        }
      }
    }
    throw new RuntimeException();
  }
}
