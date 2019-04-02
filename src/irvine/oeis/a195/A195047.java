package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195047 Concentric 17-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195047() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 17, 35});
  }
}
