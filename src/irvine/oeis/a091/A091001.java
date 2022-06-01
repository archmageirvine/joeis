package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091001 Number of walks of length n between adjacent nodes on the Petersen graph.
 * @author Sean A. Irvine
 */
public class A091001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091001() {
    super(new long[] {-6, 5, 2}, new long[] {0, 1, 0});
  }
}
