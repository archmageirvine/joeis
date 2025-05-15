package irvine.oeis.a383;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383542 a(n) = round(Shi(n)) where Shi(x) is the sinh integral function.
 * @author Sean A. Irvine
 */
public class A383542 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CrFunctions.SHI.cr(++mN).round();
  }
}

