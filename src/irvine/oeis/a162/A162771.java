package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162771.
 * @author Sean A. Irvine
 */
public class A162771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162771() {
    super(new long[] {-4, 6}, new long[] {2, 11});
  }
}
