package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084676 Position of the first zero in the decimal expansion of the square root of the n-th prime.
 * @author Sean A. Irvine
 */
public class A084676 extends A000040 {

  @Override
  public Z next() {
    final DecimalExpansionSequence s = new DecimalExpansionSequence(CR.valueOf(super.next()).sqrt());
    long k = 1;
    while (!s.next().isZero()) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
