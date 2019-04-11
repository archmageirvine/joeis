package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090590 <code>(1,1)</code> entry of powers of the orthogonal design shown below.
 * @author Sean A. Irvine
 */
public class A090590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090590() {
    super(new long[] {-8, 2}, new long[] {1, -6});
  }
}
