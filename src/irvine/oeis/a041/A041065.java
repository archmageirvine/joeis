package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041065.
 * @author Sean A. Irvine
 */
public class A041065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041065() {
    super(new long[] {-1, 0, 50, 0}, new long[] {1, 4, 49, 200});
  }
}
