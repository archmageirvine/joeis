package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035008.
 * @author Sean A. Irvine
 */
public class A035008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035008() {
    super(new long[] {1, -3, 3}, new long[] {0, 16, 48});
  }
}
