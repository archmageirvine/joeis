package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002460 Nearest integer to exponential integral of n.
 * @author Sean A. Irvine
 */
public class A002460 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    CR cr = CR.valueOf(++mN);
    return CrFunctions.EI.cr(cr).round();
  }
}
