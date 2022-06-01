package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116940 Greatest m such that A116939(m) = n.
 * @author Sean A. Irvine
 */
public class A116940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116940() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 6, 11});
  }
}
