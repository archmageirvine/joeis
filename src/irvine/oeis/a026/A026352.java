package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026352 a(n) = floor(n*tau) + n + 1 where tau is the golden ratio A001622.
 * @author Sean A. Irvine
 */
public class A026352 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().add(mN + 1);
  }
}
