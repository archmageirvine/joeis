package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140322.
 * @author Sean A. Irvine
 */
public class A140322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140322() {
    super(new long[] {-4, 1, 4}, new long[] {1, 2, 11});
  }
}
