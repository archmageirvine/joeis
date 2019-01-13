package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193766.
 * @author Sean A. Irvine
 */
public class A193766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193766() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 6, 8, 11});
  }
}
