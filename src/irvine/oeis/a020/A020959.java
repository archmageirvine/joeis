package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020959 <code>a(n) = Sum_{k&gt;=1} floor(n*phi^(1-k))</code>.
 * @author Sean A. Irvine
 */
public class A020959 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(ComputableReals.SINGLETON.pow(CR.PHI, CR.valueOf(1 - k)).multiply(mN).floor());
    }
    return sum;
  }
}
