package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a069.A069561;
import irvine.oeis.a187.A187930;

/**
 * A395046 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A395046 extends Sequence1 {

  private final Sequence mA = new A069561();
  private final Sequence mB = new A187930();
  private long mN = -1;

  @Override
  public Z next() {
    return mA.next().min(mB.next().subtract(++mN)).max(Z.TWO);
  }
}
