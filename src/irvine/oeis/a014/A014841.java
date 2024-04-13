package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A014841 Sum modulo the base of all the digits of n in every base from 2 to n-1.
 * @author Sean A. Irvine
 */
public class A014841 extends Sequence3 {

  protected long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; ++base) {
      sum += Functions.DIGIT_SUM.l(base, mN) % base;
    }
    return Z.valueOf(sum);
  }
}
