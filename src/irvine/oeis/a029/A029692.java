package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A029692 n-th bit in binary expansion of square root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029692 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR t = CR.valueOf(++mN).sqrt();
    return new SkipSequence(new DecimalExpansionSequence(true, 2) {
      @Override
      protected CR getCR() {
        return t;
      }
    }, mN - 1).next();
  }
}
