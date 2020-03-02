package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A029684 n-th digit after decimal point of 4th root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029684 implements Sequence {

  private static final CR QUARTER = CR.valueOf(Q.ONE_QUARTER);
  private long mN = 0;

  @Override
  public Z next() {
    final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(++mN), QUARTER);
    final CR f = s.subtract(CR.valueOf(s.floor()));
    return new SkipSequence(new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return f;
      }
    }, mN - 1).next();
  }
}
