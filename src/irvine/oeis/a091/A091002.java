package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091002 Number of walks of length n between non-adjacent nodes on the Petersen graph.
 * @author Sean A. Irvine
 */
public class A091002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091002() {
    super(new long[] {-6, 5, 2}, new long[] {0, 0, 1});
  }
}
