package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174508 Continued fraction expansion for <code>exp( Sum_{n&gt;=1}</code> 1/(n*A086594(n)) ), where A086594(n) <code>= (4+sqrt(17))^n + (4-sqrt(17))^n</code>.
 * @author Sean A. Irvine
 */
public class A174508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174508() {
    super(new long[] {1, 0, 0, -67, 0, 0, 67, 0, 0}, new long[] {1, 7, 65, 1, 535, 4353, 1, 35367, 287297});
  }
}
