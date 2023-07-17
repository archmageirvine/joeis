package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052062 Squares containing no palindromic substring except single digits.
 * @author Sean A. Irvine
 */
public class A052062 extends A052061 {

  /** Construct the sequence. */
  public A052062() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}

