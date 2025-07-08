package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385590 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A385590 extends Sequence1 {

  private long mN = 0;
  private long mI = 0;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      while (Functions.FIBONACCI.l(mI + 1) <= mN) {
        ++mI;
      }
      mT = Functions.FIBONACCI.z(mI - 1).square().add(1 - ((mI - 1) & 1)).add(Functions.FIBONACCI.z(mI - 2).multiply(Z.valueOf(mN).subtract(Functions.FIBONACCI.z(mI))));
    }
    return mT.add(Functions.FIBONACCI.z(mI - 1).multiply(mM - 1));
  }
}

