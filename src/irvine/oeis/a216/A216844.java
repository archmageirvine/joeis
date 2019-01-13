package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216844.
 * @author Sean A. Irvine
 */
public class A216844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216844() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 2, -2, 2});
  }
}
