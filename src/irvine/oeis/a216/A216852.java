package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216852 18k^2-36k+9 interleaved with 18k^2-18k+9 for k&gt;=0.
 * @author Sean A. Irvine
 */
public class A216852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216852() {
    super(new long[] {1, -2, 0, 2}, new long[] {9, 9, -9, 9});
  }
}
