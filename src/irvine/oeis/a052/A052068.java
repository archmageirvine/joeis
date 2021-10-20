package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052068 Palfree cubes whose root is the smallest possible greater than 10^n (palfree = contains no palindromic substring except single digits).
 * @author Sean A. Irvine
 */
public class A052068 extends A052067 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

