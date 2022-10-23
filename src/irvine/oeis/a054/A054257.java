package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054257 Concatenation of n in base 10 down up to base 2 is prime, all numbers are interpreted as decimals.
 * @author Sean A. Irvine
 */
public class A054257 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder sb = new StringBuilder();
      for (int base = 10; base >= 2; --base) {
        sb.append(Long.toString(mN, base));
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

