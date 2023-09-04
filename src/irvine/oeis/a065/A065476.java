package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065476 Decimal expansion of Product_{p prime &gt;= 3} (1 - (p+2)/p^3).
 * @author Sean A. Irvine
 */
public class A065476 extends A065468 {

  /** Construct the sequence. */
  public A065476() {
    super(new long[] {2, 1, 0}, new long[] {-2, -6, -2}, 0, CR.ONE, k -> Zeta.zetap(k).subtract(CR.valueOf(new Q(Z.ONE, Z.ONE.shiftLeft(k)))));
  }
}
