package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079847 Smallest multiple of n in which the string of digits of n occurs after (n-1) most significant digits.
 * @author Sean A. Irvine
 */
public class A079847 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final Z k = Z.TEN.pow(Functions.DIGIT_LENGTH.z(mN));
    final Z m = Z.TEN.pow(mN - 2);
    final Z mod = Z.valueOf(mN / Functions.GCD.l(mN, k));
    return mod.subtract(m).mod(mod).add(m).multiply(k).add(mN);
  }
}

