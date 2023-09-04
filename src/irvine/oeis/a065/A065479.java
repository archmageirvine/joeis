package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065479 Decimal expansion of Product_{p prime &gt;= 3} (1 - 1/(p^2-p-1)).
 * @author Sean A. Irvine
 */
public class A065479 extends A065468 {

  /** Construct the sequence. */
  public A065479() {
    super(new long[] {-2, -3, 2, 2}, new long[] {0, 0, -2, -3}, -2, CR.ONE, k -> Zeta.zetap(k).subtract(CR.valueOf(new Q(Z.ONE, Z.ONE.shiftLeft(k)))));
  }
}
