package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061601 9's complement of n: a(n) = 10^d - 1 - n where d is the number of digits in n. If a is a digit in n replace it with 9 - a.
 * @author Sean A. Irvine
 */
public class A061601 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long r = 0;
    for (int k = 0; k < s.length(); ++k) {
      r *= 10;
      r += '9' - s.charAt(k);
    }
    return Z.valueOf(r);
  }
}

