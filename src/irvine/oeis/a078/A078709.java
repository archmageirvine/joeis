package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051935.
 * @author Sean A. Irvine
 */
public class A078709 extends Sequence1 {

  private long mN;

  @Override
  public Z next() {
    return Z.valueOf(++mN).divide(Functions.SIGMA0.z(mN));
  }
}
