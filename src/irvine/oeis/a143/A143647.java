package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143647 <code>a(n) = ((5 + sqrt(3))^n + (5 - sqrt(3))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A143647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143647() {
    super(new long[] {-22, 10}, new long[] {1, 5});
  }
}
