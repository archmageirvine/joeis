package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;

/**
 * A024415 Position of max{s(n,k): k=1,2,...,n} in A024412, n &gt;= 1, where s(n,k) = Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A024415 extends A024412 {

  private long mN = -1;
  private long mPos = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z max = Z.ONE;
    for (long k = 2; k <= mN; ++k) {
      max = max.max(Stirling.secondKind(mN + 1, k));
    }
    Z t;
    do {
      ++mPos;
      t = super.next();
    } while (!t.equals(max));
    return Z.valueOf(mPos);
  }
}
