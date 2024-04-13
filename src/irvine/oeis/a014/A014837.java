package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A014837 Sum of all the digits of n in every base from 2 to n-1.
 * @author Sean A. Irvine
 */
public class A014837 extends Sequence3 {

  protected long mN = 2;

  protected long nextSum() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; ++base) {
      sum += Functions.DIGIT_SUM.l(base, mN);
    }
    return sum;
  }

  @Override
  public Z next() {
    return Z.valueOf(nextSum());
  }
}
