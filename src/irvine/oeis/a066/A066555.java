package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036211;

/**
 * A066555 a(n) = next substring in concatenation of even numbers with length n (incl. leading zeros).
 * @author Sean A. Irvine
 */
public class A066555 extends Sequence1 {

  private final Sequence mA = new A036211().skip();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      res = res.multiply(10).add(mA.next());
    }
    return res;
  }
}
