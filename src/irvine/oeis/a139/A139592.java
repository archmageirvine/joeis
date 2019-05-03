package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139592 <code>A033585(n)</code> followed by <code>A139271(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A139592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139592() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 2, 10, 20});
  }
}
