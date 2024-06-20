package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070958 Numbers n such that the largest digit of n is the same as the largest digit of (sum of digits of n).
 * @author Sean A. Irvine
 */
public class A070958 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long ds = Functions.DIGIT_SUM.l(++mN);
      final long s1 = Functions.SYNDROME.i(mN);
      final long s2 = Functions.SYNDROME.i(ds);
      final long xor = s1 ^ s2;
      if (xor < s1 && xor < s2) {
        return Z.valueOf(mN);
      }
    }
  }
}
