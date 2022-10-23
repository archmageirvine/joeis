package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052065 a(n) is the first square root greater than 10^n such that a(n)^2 is a palfree square (palfree = contains no palindromic substring except single digits).
 * @author Sean A. Irvine
 */
public class A052065 extends Sequence1 {

  // After Keith Schneider

  private Q mStart = new Q(340, 333);

  @Override
  public Z next() {
    mStart = mStart.multiply(100);
    Z m = mStart.toZ().sqrt();
    while (!A052057.isPalindromeFree(m.square().toString())) {
      m = m.add(1);
    }
    return m;
  }
}
