package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216876 20k^2-20k-5 interleaved with 20k^2+5 for k=&gt;0.
 * @author Sean A. Irvine
 */
public class A216876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216876() {
    super(new long[] {1, -2, 0, 2}, new long[] {-5, 5, -5, 25});
  }
}
