package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394449 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A394449 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN * (mN + 1) / 2)
      .subtract(Z.ONE.shiftLeft(mN * (mN - 1) / 2))
      .subtract(Functions.BELL.z(mN + 1))
      .add(Functions.BELL.z(mN));
  }
}
