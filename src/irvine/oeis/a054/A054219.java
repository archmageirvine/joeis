package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054219 Concatenation of n in base 10 down to base 2 is divisible by at least one of these base b numbers, all numbers interpreted as decimals.
 * @author Sean A. Irvine
 */
public class A054219 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder sb = new StringBuilder();
      for (int base = 10; base > 1; --base) {
        sb.append(Long.toString(mN, base));
      }
      final Z t = new Z(sb);
      System.out.println("n=" + mN + " t=" + t);
      for (int base = 10; base > 1; --base) {
        if (t.mod(new Z(Long.toString(mN, base))).isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

