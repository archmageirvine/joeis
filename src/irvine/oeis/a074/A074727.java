package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A074727 Number of steps needed to reach a prime when the following map is repeatedly applied to n: if n is even then 2n + SOD(n) + 1, otherwise 2n - SOD(n) - 1, where SOD(n) is the sum of the digits of n; or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A074727 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    do {
      t = t.isEven()
        ? t.multiply2().add(1).add(Functions.DIGIT_SUM.z(t))
        : t.multiply2().subtract(1).subtract(Functions.DIGIT_SUM.z(t));
      ++cnt;
    } while (!t.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
