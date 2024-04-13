package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067040 a(n) = n^(sum of digits of n).
 * @author Georg Fischer
 */
public class A067040 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(Functions.DIGIT_SUM.l(mN));
  }
}
