package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;

/**
 * A024416 a(n) = position of next-to-largest s(n,k), for k=1,2,...,n, in A024412, n &gt;= 3, where s(n,k) = Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A024416 extends A024412 {

  private long mN = 2;
  private long mPos = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    Z maxButOne = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      final Z s2 = Stirling.secondKind(mN, k);
      if (s2.compareTo(max) > 0) {
        maxButOne = max;
        max = s2;
      } else if (s2.compareTo(maxButOne) > 0) {
        maxButOne = s2;
      }
    }
    Z t;
    do {
      ++mPos;
      t = super.next();
    } while (!t.equals(maxButOne));
    return Z.valueOf(mPos);
  }
}
