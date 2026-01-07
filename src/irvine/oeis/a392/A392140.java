package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392140 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A392140 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(Z.valueOf(++mN).pow(mN));
    return Functions.BIG_OMEGA.z(mSum);
  }
}

