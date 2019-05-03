package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188652 First differences of <code>A000463</code>.
 * @author Sean A. Irvine
 */
public class A188652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188652() {
    super(new long[] {-1, -1, 2, 2, -1}, new long[] {0, 1, 2, -1, 6});
  }
}
