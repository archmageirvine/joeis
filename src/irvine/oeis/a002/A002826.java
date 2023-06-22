package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008827;
import irvine.oeis.a246.A246069;
import irvine.oeis.a246.A246137;
import irvine.oeis.a246.A246417;

/**
 * A002826 Number of precomplete Post functions of n variables.
 * @author Sean A. Irvine
 */
public class A002826 extends Sequence1 {

  private long mN = 0;
  private final Sequence mR1 = new A002824(); // n >= 2
  private final Sequence mR2 = new A246069(); // n >= 1
  private final Sequence mR3 = new A246137(); // n >= 1
  private final Sequence mR4 = new A008827(); // n >= 2
  private final Sequence mR5 = new A002825(); // n >= 1
  private final Sequence mR6 = new A246417(); // n >= 1

  @Override
  public Z next() {
    // Some of the subsequences are only defined for n >= 3
    ++mN;
    return (mN > 1 ? mR1.next() : Z.ZERO)
      .add(mR2.next())
      .add(mR3.next())
      .add(mN > 1 ? mR4.next() : Z.ZERO)
      .add(mR5.next())
      .add(mR6.next());
  }
}
