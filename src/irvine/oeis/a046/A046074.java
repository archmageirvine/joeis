package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023052;

/**
 * A046074 Power of digits of A023052 such that the sum of powers of digits equals A023052.
 * @author Sean A. Irvine
 */
public class A046074 extends A023052 {

  @Override
  public Z next() {
    final Z n = super.next();
    final String s = n.toString();
    long power = 0;
    while (true) {
      ++power;
      Z sum = Z.ZERO;
      for (int k = 0; k < s.length(); ++k) {
        sum = sum.add(Z.valueOf(s.charAt(k) - '0').pow(power));
      }
      if (sum.equals(n)) {
        return Z.valueOf(power);
      }
    }
  }
}
