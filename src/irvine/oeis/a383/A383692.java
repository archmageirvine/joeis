package irvine.oeis.a383;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383692 a(n) = round(Chi(n)) where Chi(x) is the cosh integral function.
 * @author Sean A. Irvine
 */
public class A383692 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CrFunctions.CHI.cr(++mN).round();
  }
}

