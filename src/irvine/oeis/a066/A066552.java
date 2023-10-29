package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001191;

/**
 * A066552 Sum of digits of n-th term of A066551.
 * @author Sean A. Irvine
 */
public class A066552 extends Sequence1 {

  private final Sequence mA = new A001191();
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
