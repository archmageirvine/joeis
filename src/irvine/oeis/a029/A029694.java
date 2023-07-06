package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A029694 n-th bit in binary expansion of cube root of n.
 * @author Sean A. Irvine
 */
public class A029694 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final AbstractSequence seq = new DecimalExpansionSequence(0, ComputableReals.SINGLETON.pow(CR.valueOf(++mN), CR.ONE_THIRD), 2);
    return seq.skip(mN - 1).next();
  }
}
