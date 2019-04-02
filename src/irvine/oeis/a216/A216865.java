package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216865 16k^2-32k+8 interleaved with 16k^2-16k+8 for k&gt;=0.
 * @author Sean A. Irvine
 */
public class A216865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216865() {
    super(new long[] {1, -2, 0, 2}, new long[] {8, 8, -8, 8});
  }
}
