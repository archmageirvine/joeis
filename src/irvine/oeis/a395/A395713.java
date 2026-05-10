package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000798;
import irvine.oeis.a006.A006905;

/**
 * A395713 Number of binary relations on an n-set that are neither reflexive nor symmetric nor transitive.
 * @author Sean A. Irvine
 */
public class A395713 extends Sequence0 {

  private final Sequence mA = new A006905();
  private final Sequence mB = new A000798();
  private long mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN * mN)
      .subtract(Z.ONE.shiftLeft(mN * mN - mN))
      .subtract(Z.ONE.shiftLeft(mN * (mN + 1) / 2))
      .add(Z.ONE.shiftLeft(mN * (mN - 1) / 2))
      .subtract(mA.next())
      .add(mB.next())
      .add(Functions.BELL.z(mN + 1))
      .subtract(Functions.BELL.z(mN));
  }
}
