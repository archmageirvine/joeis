package irvine.oeis.a190;
// manually concatf/concats at 2022-12-30 17:50

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A190480 Concatenation of first n digits in the concatenation of first n primes written in base 2.
 * @author Georg Fischer
 */
public class A190480 extends A000040 {

  private int mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    ++mN;
    while (mN >= mS.length()) {
      mS.append(super.next().toString(2));
    }
    return new Z(mS.substring(0, mN));
  }
}
