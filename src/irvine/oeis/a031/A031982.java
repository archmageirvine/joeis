package irvine.oeis.a031;

import irvine.oeis.LinearRecurrence;

/**
 * A031982 <code>1(01)^(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A031982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A031982() {
    super(new long[] {-10000, 10001}, new long[] {101, 1010101});
  }
}
