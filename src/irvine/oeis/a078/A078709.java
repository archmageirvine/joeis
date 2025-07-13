package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078709 a(n) = floor(n/d(n)), where d(n) is the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A078709 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).divide(Functions.SIGMA0.z(mN));
  }
}
