package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178349 Partial sums of sum_{n=0...infinity} <code>1010^n</code>.
 * @author Sean A. Irvine
 */
public class A178349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178349() {
    super(new long[] {-1010, 1011}, new long[] {1, 1011});
  }
}
