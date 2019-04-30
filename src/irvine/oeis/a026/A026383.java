package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026383 <code>a(n) = 5a(n-2)</code>, starting 1,2.
 * @author Sean A. Irvine
 */
public class A026383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026383() {
    super(new long[] {5, 0}, new long[] {1, 2});
  }
}
