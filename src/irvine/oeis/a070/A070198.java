package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003418;

/**
 * A070198 Smallest nonnegative number m such that m == i (mod i+1) for all 1 &lt;= i &lt;= n.
 * @author Sean A. Irvine
 */
public class A070198 extends Sequence0 {

  private final Sequence mA = new A003418().skip();

  @Override
  public Z next() {
    return mA.next().subtract(1);
  }
}
