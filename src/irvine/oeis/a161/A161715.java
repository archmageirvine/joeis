package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161715.
 * @author Sean A. Irvine
 */
public class A161715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161715() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 3, 5, 6, 10, 15, 30});
  }
}
