package irvine.oeis.a075;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075727 a(n) = 2 Pi * n rounded off.
 * @author Sean A. Irvine
 */
public class A075727 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.TAU.multiply(++mN).round();
  }
}
