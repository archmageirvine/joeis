package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085547.
 * @author Sean A. Irvine
 */
public class A085804 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z nn = Z.valueOf(++mN).pow(mN);
    return Functions.NEXT_PALINDROME.z(nn).subtract(nn);
  }
}
