package irvine.oeis.a383;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383542 allocated for Kritsada Moomuang.
 * @author Sean A. Irvine
 */
public class A383542 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CrFunctions.SHI.cr(++mN).round();
  }
}

