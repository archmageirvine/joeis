package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096773 <code>a(n+2) = 4*a(n) + 1; a(1) = 0, a(2) = 3</code>.
 * @author Sean A. Irvine
 */
public class A096773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096773() {
    super(new long[] {-4, 4, 1}, new long[] {0, 3, 1});
  }
}
