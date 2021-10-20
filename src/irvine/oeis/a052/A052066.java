package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052066 Palfree squares whose root is the smallest possible greater than 10^n (palfree = contains no palindromic substring except single digits).
 * @author Sean A. Irvine
 */
public class A052066 extends A052065 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

