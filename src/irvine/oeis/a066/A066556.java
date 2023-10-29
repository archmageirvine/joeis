package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036211;

/**
 * A066556 Sum of digits of n-th term of A066555.
 * @author Sean A. Irvine
 */
public class A066556 extends Sequence1 {

  private final Sequence mA = new A036211().skip();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      res = res.add(mA.next());
    }
    return res;
  }
}
