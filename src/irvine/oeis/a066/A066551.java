package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001191;

/**
 * A066551 Let N =149162536496481100121441691962252562893243614..., the concatenation of the squares. a(n) is the n-digit number formed from the digits of N starting from the {n(n-1)/2 +1}th digit. Omit any leading zeros.
 * @author Sean A. Irvine
 */
public class A066551 extends Sequence1 {

  private final Sequence mA = new A001191();
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
