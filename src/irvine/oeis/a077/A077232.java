package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000037;
import irvine.oeis.a006.A006702;

/**
 * A077230.
 * @author Sean A. Irvine
 */
public class A077232 extends A006702 {

  private final Sequence mD = new A000037();

  @Override
  public Z next() {
    return solve(mD.next().longValueExact()).num();
  }
}
