package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.SkipSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A029692 n-th bit in binary expansion of square root of n.
 * @author Sean A. Irvine
 */
public class A029692 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new SkipSequence(new DecimalExpansionSequence(0, CR.valueOf(++mN).sqrt(), 2), mN - 1).next();
  }
}
