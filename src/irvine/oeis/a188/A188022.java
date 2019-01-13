package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188022.
 * @author Sean A. Irvine
 */
public class A188022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188022() {
    super(new long[] {1, 3, 0}, new long[] {0, 1, 1});
  }
}
