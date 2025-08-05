package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079210 Positive divisors of n!, listed in increasing order for each n, a new row for each n.
 * @author Sean A. Irvine
 */
public class A079210 extends Sequence0 {

  private int mN = 0;
  private Z[] mD = Jaguar.factor(Z.ONE).divisorsSorted();
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mD.length) {
      mD = Jaguar.factor(Functions.FACTORIAL.z(++mN)).divisorsSorted();
      mM = 0;
    }
    return mD[mM];
  }
}
