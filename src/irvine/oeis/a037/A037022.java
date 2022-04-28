package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A037022 Triangle in which row n has the first n digits of sqrt(n) (truncated).
 * @author Sean A. Irvine
 */
public class A037022 implements Sequence {

  private Sequence mA = null;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      mA = new DecimalExpansionSequence(CR.valueOf(++mN).sqrt());
    }
    return mA.next();
  }
}
