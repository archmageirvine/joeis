package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A029694 n-th bit in binary expansion of cube root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029694 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR t = ComputableReals.SINGLETON.pow(CR.valueOf(++mN), CR.ONE_THIRD);
    return new SkipSequence(new DecimalExpansionSequence(true, 2) {
      @Override
      protected CR getCR() {
        return t;
      }
    }, mN - 1).next();
  }
}
