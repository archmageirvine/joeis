package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006366;
import irvine.oeis.a008.A008793;
import irvine.oeis.a049.A049503;
import irvine.oeis.a049.A049505;
import irvine.oeis.a181.A181119;
import irvine.oeis.a259.A259049;

/**
 * A066931 Number of ways to tile hexagon of edge n with diamonds of side 1, not counting rotations and reflections as different.
 * @author Sean A. Irvine
 */
public class A066931 extends Sequence0 {

  private boolean mEven = false;
  private final Sequence mA = new A008793();
  private final Sequence mB = new A049505();
  private final Sequence mC = new A006366();
  private final Sequence mD = new A181119();
  private final Sequence mE = new A259049();
  private final Sequence mF = new A049503();

  @Override
  public Z next() {
    mEven = !mEven;
    Z t = mA.next().add(mB.next().multiply(3)).add(mC.next().multiply2());
    if (mEven) {
      t = t.add(mD.next().multiply(3)).add(mE.next()).add(mF.next().multiply(2));
    }
    return t.divide(12);
  }
}
