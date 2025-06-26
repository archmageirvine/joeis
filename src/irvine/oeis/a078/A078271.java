package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A078271 a(n) is the number from which if even-positioned digits are deleted then one gets the concatenation of 1 to n, while if odd-positioned digits are deleted then one gets reverse concatenation of 1 to n. Position of least significant digit is considered to be 1.
 * @author Sean A. Irvine
 */
public class A078271 extends Sequence1 {

  private final Sequence mA = new A000422();
  private final Sequence mB = new A007908();

  @Override
  public Z next() {
    final String even = mA.next().toString();
    final String odd = mB.next().toString();
    Z res = Z.ZERO;
    for (int k = 0; k < even.length(); ++k) {
      res = res.multiply(10).add(even.charAt(k) - '0').multiply(10).add(odd.charAt(k) - '0');
    }
    return res;
  }
}

