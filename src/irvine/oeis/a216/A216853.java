package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216853 18k^2-12k-7 interleaved with 18k^2+6k+5 for k&gt;=0.
 * @author Sean A. Irvine
 */
public class A216853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216853() {
    super(new long[] {1, -2, 0, 2}, new long[] {-7, 5, -1, 29});
  }
}
