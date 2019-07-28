package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024853 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers), <code>t =</code> (natural numbers <code>&gt;= 2)</code>.
 * @author Sean A. Irvine
 */
public class A024853 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final long m = ++mN / 2;
    return Z.valueOf(m).multiply(m + 1).multiply(3 * mN + 5 - 2 * m).divide(6);
  }
}
