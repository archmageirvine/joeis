package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085474 <code>C(2*n+4,4)-C(2*n,4)</code>.
 * @author Sean A. Irvine
 */
public class A085474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085474() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 15, 69, 195});
  }
}
