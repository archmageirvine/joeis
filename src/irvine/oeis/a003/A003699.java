package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003699.
 * @author Sean A. Irvine
 */
public class A003699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003699() {
    super(new long[] {0, -1, 4}, new long[] {1, 6, 22});
  }
}
