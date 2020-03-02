package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A029683 <code>a(n) = n-th</code> digit after decimal point of cube root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029683 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = ComputableReals.SINGLETON.pow(CR.valueOf(++mN), CR.ONE_THIRD);
    final CR f = s.subtract(CR.valueOf(s.floor()));
    return new SkipSequence(new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return f;
      }
    }, mN - 1).next();
  }
}
