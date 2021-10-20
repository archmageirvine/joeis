package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052067 a(n) is the first cube root greater than 10^n such that a(n)^3 is a palfree cube (palfree = contains no palindromic substring except single digits).
 * @author Sean A. Irvine
 */
public class A052067 implements Sequence {

  // After Keith Schneider

  private Q mStart = new Q(340, 333);

  @Override
  public Z next() {
    mStart = mStart.multiply(1000);
    Z m = mStart.toZ().root(3);
    while (!A052057.isPalindromeFree(m.pow(3).toString())) {
      m = m.add(1);
    }
    return m;
  }
}
