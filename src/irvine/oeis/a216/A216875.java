package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216875 20k^2-40k+10 interleaved with 20k^2-20k+10 for k&gt;=0.
 * @author Sean A. Irvine
 */
public class A216875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216875() {
    super(new long[] {1, -2, 0, 2}, new long[] {10, 10, -10, 10});
  }
}
