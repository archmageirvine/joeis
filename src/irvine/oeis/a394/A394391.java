package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394391 a(n) = tau(n)^2 + (n - tau(n))^2.
 * @author Sean A. Irvine
 */
public class A394391 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Functions.SIGMA0.z(++mN);
    return s.square().add(Z.valueOf(mN).subtract(s).square());
  }
}
