package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031312;

/**
 * A066553 Let N = 1357911131517192123252729313335373941434547495153555759616365676971..., the concatenation of the odd numbers. a(n) is the n-digit number formed from the digits of N starting from the {n(n-1)/2 +1}th digit. Omit any leading zeros.
 * @author Sean A. Irvine
 */
public class A066553 extends Sequence1 {

  private final Sequence mA = new A031312();
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
