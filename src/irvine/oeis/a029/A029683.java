package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A029683 a(n) = n-th digit after decimal point of cube root of n.
 * @author Sean A. Irvine
 */
public class A029683 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(++mN), CR.ONE_THIRD);
    return new DecimalExpansionSequence(s.subtract(CR.valueOf(s.floor()))).skip(mN - 1).next();
  }
}
