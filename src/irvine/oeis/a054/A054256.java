package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054256 Concatenation of n in base 2 up to base 10 is prime, all numbers are interpreted as decimals.
 * @author Sean A. Irvine
 */
public class A054256 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder sb = new StringBuilder();
      for (int base = 2; base <= 10; ++base) {
        sb.append(Long.toString(mN, base));
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

