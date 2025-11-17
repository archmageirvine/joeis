package irvine.oeis.a136;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A136616 a(n) = largest m with H(m) - H(n) &lt;= 1, where H(i) = Sum_{j=1 to i} 1/j, the i-th harmonic number, H(0) = 0.
 * @author Sean A. Irvine
 */
public class A136616 extends Sequence0 implements DirectSequence {

  private static final CR E1 = CR.E.subtract(1).divide(2);
  private static final CR E2 = CR.E.subtract(CR.E.inverse()).multiply(2);
  private long mN = -1;

  @Override
  public Z a(final Z n) {
    return CR.E.multiply(n).add(E1).add(E2.divide(n.multiply(48).add(24))).floor();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
