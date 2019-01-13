package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192965.
 * @author Sean A. Irvine
 */
public class A192965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192965() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 1, 4, 11});
  }
}
