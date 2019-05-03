package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272647 <code>a(n) = A001517(n) mod 7</code>.
 * @author Sean A. Irvine
 */
public class A272647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272647() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 5, 4, 5, 3, 1});
  }
}
