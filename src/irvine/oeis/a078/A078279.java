package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;
import irvine.oeis.a132.A132932;

/**
 * A078279 a(n) is the number from which if odd-positioned digits are deleted then one gets the concatenation of first n composite numbers, while if even-positioned digits are deleted then one gets reverse concatenation of first n composite numbers. Position of least significant digit is considered to be 1.
 * @author Sean A. Irvine
 */
public class A078279 extends Sequence1 {

  private final Sequence mA = new A132932();

  // Apparently reverse concatenation of composites does not have an existing sequence
  private final Sequence mB = new A002808() {
    private final StringBuilder mS = new StringBuilder();
    @Override
    public Z next() {
      mS.insert(0, super.next());
      return new Z(mS);
    }
  };

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

