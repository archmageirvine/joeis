package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006318;

/**
 * A395133 allocated for Mansur Zubairu.
 * @author Sean A. Irvine
 */
public class A395133 extends Sequence1 {

  private final DirectSequence mS = new A006318();
  private long mN = 0;

  @Override
  public Z next() {
    return mS.a(++mN).add(Functions.FIBONACCI.z(2 * mN + 1)).add(1 + mN).subtract(Z.ONE.shiftLeft(mN + 1));
  }
}
