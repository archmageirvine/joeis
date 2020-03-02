package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A029686 n-th digit after decimal point of 6th root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029686 implements Sequence {

  private static final CR ONE_SIXTH = CR.valueOf(new Q(1, 6));
  private long mN = 0;

  @Override
  public Z next() {
    final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(++mN), ONE_SIXTH);
    final CR f = s.subtract(CR.valueOf(s.floor()));
    return new SkipSequence(new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return f;
      }
    }, mN - 1).next();
  }
}
