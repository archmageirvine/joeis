package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272263 <code>a(n) =</code> numerator of A000032(n) <code>- 1/2^n</code>.
 * @author Sean A. Irvine
 */
public class A272263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272263() {
    super(new long[] {-4, 2, 3}, new long[] {1, 1, 11});
  }
}
