package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A032337 Number of identity bracelets with n labeled beads of 2 colors.
 * @author Sean A. Irvine
 */
public class A032337 extends Sequence1 {

  private final Sequence mA = new A032239();
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mA.next().multiply(mF);
  }
}
