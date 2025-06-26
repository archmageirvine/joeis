package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a019.A019520;
import irvine.oeis.a038.A038396;

/**
 * A078275 a(n) is the number from which if odd-positioned digits are deleted then one gets the concatenation of first n even numbers, while if even-positioned digits are deleted then one gets reverse concatenation of first n even numbers. Position of least significant digit is considered to be 1.
 * @author Sean A. Irvine
 */
public class A078275 extends Sequence1 {

  private final Sequence mA = new A019520();
  private final Sequence mB = new A038396();

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

