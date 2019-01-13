package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216257.
 * @author Sean A. Irvine
 */
public class A216257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216257() {
    super(new long[] {1, -3, 3}, new long[] {86861, 64601, 44021});
  }
}
