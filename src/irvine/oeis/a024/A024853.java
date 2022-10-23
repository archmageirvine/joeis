package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024853 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers), t = (natural numbers &gt;= 2).
 * @author Sean A. Irvine
 */
public class A024853 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final long m = ++mN / 2;
    return Z.valueOf(m).multiply(m + 1).multiply(3 * mN + 5 - 2 * m).divide(6);
  }
}
