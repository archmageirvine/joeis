package irvine.oeis.a292;
// manually inverse at 2023-07-24 10:20

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A292579 Inverse to A055643: Consider n as a number written in base 60, using 2 decimal digits for each base-60 digit (which we allow to be in the range 0 .. 99), and write n in base 10.
 * @author Georg Fischer
 */
public class A292579 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    String num = String.valueOf(++mN);
    if ((num.length() & 1) == 1) { // make an even number of digits
      num = "0" + num;
    }
    Z sum = Z.ZERO;
    for (int i = 0; i < num.length(); i += 2) {
      sum = sum.multiply(60).add(Integer.parseInt(num.substring(i, i + 2)));
    }
    return sum;
  }
}
