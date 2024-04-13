package irvine.oeis.a110;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A110367 n divided by sum of digits of n if that is an integer, else n multiplied by the same.
 * @author Georg Fischer
 */
public class A110367 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long sum = Functions.DIGIT_SUM.l(mN);
    return Z.valueOf(mN % sum == 0 ? mN / sum : mN * sum);
  }
}
