package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070635 a(n) = n mod (sum of digits of n).
 * @author Georg Fischer
 */
public class A070635 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).mod(Functions.DIGIT_SUM.z(mN));
  }
}
