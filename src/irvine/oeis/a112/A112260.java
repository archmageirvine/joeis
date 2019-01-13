package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112260.
 * @author Sean A. Irvine
 */
public class A112260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112260() {
    super(new long[] {8, -6, 3}, new long[] {1, -1, -1});
  }
}
