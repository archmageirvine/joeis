package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085938 a(n) is the (n+1)-digit number in which the first digit is 1 and the subsequent digits increase by steps of n (mod 10).
 * @author Georg Fischer
 */
public class A085938 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ONE;
    Z digit = Z.ONE;
    for (int i = 1; i <= mN; ++i) {
      digit = digit.add(mN);
      result = result.multiply(10).add(digit.mod(Z.TEN));
    }
    return result;
  }
}
