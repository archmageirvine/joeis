package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a177.A177274;

/**
 * A066580 Let N = 123456789123456789123456789..., with the digits from 1 to 9 repeated indefinitely. Then a(n) is the n-digit number formed from the digits starting at the {(n(n-1)/2 +1}-th position of N, read backwards if n is even.
 * @author Sean A. Irvine
 */
public class A066580 extends Sequence1 {

  private final Sequence mA = new A177274();
  private int mN = 0;

  @Override
  public Z next() {
    Z res = Z.ZERO;
    if ((++mN & 1) == 0) {
      Z t = Z.ONE;
      for (int k = 0; k < mN; ++k, t = t.multiply(10)) {
        res = res.add(mA.next().multiply(t));
      }
    } else {
      for (int k = 0; k < mN; ++k) {
        res = res.multiply(10).add(mA.next());
      }
    }
    return res;
  }
}
