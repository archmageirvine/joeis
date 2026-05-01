package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084677 Position of the first zero in the decimal expansion of sqrt(n).
 * @author Sean A. Irvine
 */
public class A084677 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final DecimalExpansionSequence s = new DecimalExpansionSequence(CR.valueOf(mN).sqrt());
    long k = 1;
    while (!s.next().isZero()) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
