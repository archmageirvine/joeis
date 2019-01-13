package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112652.
 * @author Sean A. Irvine
 */
public class A112652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112652() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 1, 4, 9});
  }
}
