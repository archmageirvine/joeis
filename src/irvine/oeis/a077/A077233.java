package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000037;
import irvine.oeis.a006.A006702;

/**
 * A077233 a(n) is smallest natural number satisfying Pell equation b^2- d(n)*a^2= +1 or = -1, with d(n)=A000037(n) (nonsquare). Corresponding smallest b(n)=A077232(n).
 * @author Sean A. Irvine
 */
public class A077233 extends A006702 {

  private final Sequence mD = new A000037();

  @Override
  public Z next() {
    return solve(mD.next().longValueExact()).den();
  }
}
