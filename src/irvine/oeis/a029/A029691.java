package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.SkipSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A029691 n-th binary digit in fractional part of square root of n.
 * @author Sean A. Irvine
 */
public class A029691 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR t = CR.valueOf(++mN).sqrt();
    final CR f = t.subtract(CR.valueOf(t.floor()));
    return new SkipSequence(new DecimalExpansionSequence(0, f, 2), mN - 1).next();
  }
}
