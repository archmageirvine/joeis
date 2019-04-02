package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112831 Number of non-intersecting cycle systems in a particular directed graph.
 * @author Sean A. Irvine
 */
public class A112831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112831() {
    super(new long[] {-9, 7}, new long[] {1, 2});
  }
}
