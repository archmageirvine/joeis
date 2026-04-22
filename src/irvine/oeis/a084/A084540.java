package irvine.oeis.a084;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084540 a(n) is the algebraic order of the elliptic lambda function lambda^*(n), where lambda^*(n) is the value of k_n such that K'(k_n)/K(k_n) = sqrt(n), K(k) is a complete elliptic function and K'(k) is the complementary function.
 * @author Sean A. Irvine
 */
public class A084540 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GCD.z(2, ++mN + 1).multiply(LongUtils.classNumber(-16 * mN));
  }
}
