package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008827;
import irvine.oeis.a246.A246069;
import irvine.oeis.a246.A246137;
import irvine.oeis.a246.A246417;

/**
 * A002826.
 * @author Sean A. Irvine
 */
public class A002826 implements Sequence {

  private long mN = 0;
  private final Sequence mR1 = new A002824(); // n >= 2
  private final Sequence mR2 = new A246069(); // n >= 1
  private final Sequence mR3 = new A246137(); // n >= 1
  private final Sequence mR4 = new A008827(); // n >= 3
  private final Sequence mR5 = new A002825(); // n >= 1
  private final Sequence mR6 = new A246417(); // n >= 1

  private Z r1() {
    return mN > 1 ? mR1.next() : Z.ZERO;
  }

  private Z r4() {
    return mN > 2 ? mR4.next() : Z.ZERO;
  }

  @Override
  public Z next() {
    // Some of the subsequences are only defined for n >= 3
    ++mN;

    return r1()
      .add(mR2.next())
      .add(mR3.next())
      .add(r4())
      .add(mR5.next())
      .add(mR6.next());
  }
}
