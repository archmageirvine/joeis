package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A025581 Triangle read by rows: T(n, k) = n-k, for 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A025581 extends Sequence0 implements DirectSequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return Z.valueOf(mM);
  }

  @Override
  public Z a(final Z n) {
    final Z inv = Functions.TRINV.z(n);
    return inv.multiply(inv.add(3)).divide2().subtract(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
