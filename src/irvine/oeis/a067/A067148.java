package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067148 Fibonacci-like sequences. a(n) is the number of pairs of integers (n,i), 0&lt;i&lt;n, with Property F: i and n are consecutive terms i=b(j-1) and n=b(j), for some j&gt;2, of a sequence {b(k)} satisfying b(1)=1, b(2)&gt;0 and b(k)=b(k-1)+b(k-2) for all k&gt;2.
 * @author Sean A. Irvine
 */
public class A067148 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    long f0 = 3;
    long f1 = 2;
    long f2 = 1;
    long cnt = 0;
    while (f0 <= mN) {
      if ((mN - f0) % f2 == 0) {
        ++cnt;
      }
      f2 = f1;
      f1 = f0;
      f0 = f2 + f1;
    }
    return Z.valueOf(cnt);
  }
}
