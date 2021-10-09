package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A029685 n-th digit after decimal point of 5th root of n.
 * @author Sean A. Irvine
 */
public class A029685 implements Sequence {

  private static final CR ONE_FIFTH = CR.valueOf(new Q(1, 5));
  private long mN = 0;

  @Override
  public Z next() {
    final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(++mN), ONE_FIFTH);
    return new SkipSequence(new DecimalExpansionSequence(s.subtract(CR.valueOf(s.floor()))), mN - 1).next();
  }
}
