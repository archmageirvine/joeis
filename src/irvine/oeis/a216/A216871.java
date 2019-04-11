package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216871 <code>16k^2-16k-4</code> interleaved with <code>16k^2+4</code> for <code>k&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A216871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216871() {
    super(new long[] {1, -2, 0, 2}, new long[] {-4, 4, -4, 20});
  }
}
