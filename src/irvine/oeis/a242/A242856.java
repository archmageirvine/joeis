package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242856 Number of 2-matchings of the n X n grid graph.
 * @author Sean A. Irvine
 */
public class A242856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242856() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 44, 224, 686, 1622});
  }
}
