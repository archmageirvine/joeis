package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081229 a(n) is the sum of the common digits of n and the n-th prime in base 10, or -1 if there are no common digits.
 * @author Sean A. Irvine
 */
public class A081229 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final int syn0 = Functions.SYNDROME.i(++mN);
    final int syn1 = Functions.SYNDROME.i(super.next());
    final int common = syn0 & syn1;
    if (common == 0) {
      return Z.NEG_ONE;
    }
    long sum = 0;
    for (int k = 1; k < 10; ++k) {
      if ((common & (1 << k)) != 0) {
        sum += k;
      }
    }
    return Z.valueOf(sum);
  }
}
