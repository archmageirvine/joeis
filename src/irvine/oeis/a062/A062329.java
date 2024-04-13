package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A062329 A062329 a(n) = (sum of digits of n) - (product of digits of n).
 * @author Georg Fischer
 */
public class A062329 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(Functions.DIGIT_SUM.l(mN) - ZUtils.digitProduct(mN));
  }
}
