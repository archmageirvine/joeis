package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078703 Number of ways of subtracting twice a triangular number from a perfect square to obtain the integer n.
 * @author Sean A. Irvine
 */
public class A078703 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 4;
    return Functions.SIGMA0.z(mN).divide2();
  }
}

