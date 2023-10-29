package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031312;

/**
 * A066554 Sum of digits of n-th term of A066553.
 * @author Sean A. Irvine
 */
public class A066554 extends Sequence1 {

  private final Sequence mA = new A031312();
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
