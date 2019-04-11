package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291733 <code>a(n) =</code> (1/4)*A291732(n).
 * @author Sean A. Irvine
 */
public class A291733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291733() {
    super(new long[] {-4, 0, -8, 4, -4, 4}, new long[] {1, 3, 9, 26, 72, 195});
  }
}
