package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079903.
 * @author Sean A. Irvine
 */
public class A079903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079903() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 28, 190, 703, 1891});
  }
}
