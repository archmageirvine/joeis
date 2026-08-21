package irvine.oeis.a138;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A138808 Number of integer pairs (x,y), x &gt; 0, y &gt; 0, such that x &lt;= p, y &lt;= q for any factorization n = p*q.
 * @author Sean A. Irvine
 */
public class A138808 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    Z res = Z.ZERO;
    Z pd = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      res = res.add(d.subtract(pd).multiply(mN).divide(d));
      pd = d;
    }
    return res;
  }
}
