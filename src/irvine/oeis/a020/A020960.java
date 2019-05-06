package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020960.
 * @author Sean A. Irvine
 */
public class A020960 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * mN; ++k) {
      sum = sum.add(ComputableReals.SINGLETON.pow(CR.PHI, CR.valueOf(2 - k)).multiply(CR.valueOf(mN)).floor());
    }
    return sum;
  }
}
