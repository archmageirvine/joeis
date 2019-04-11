package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216853 <code>18k^2-12k-7</code> interleaved with <code>18k^2+6k+5</code> for <code>k&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A216853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216853() {
    super(new long[] {1, -2, 0, 2}, new long[] {-7, 5, -1, 29});
  }
}
