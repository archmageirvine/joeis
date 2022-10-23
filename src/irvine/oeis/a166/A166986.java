package irvine.oeis.a166;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A166986 a(n) = 2*floor((n+2)/log(2)) - 4.
 * @author Sean A. Irvine
 */
public class A166986 extends Sequence1 {

  private static final CR LOG2 = CR.TWO.log();
  private long mN = 2;

  @Override
  public Z next() {
    return CR.valueOf(++mN).divide(LOG2).floor().multiply2().subtract(4);
  }
}
