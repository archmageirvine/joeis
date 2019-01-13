package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175629.
 * @author Sean A. Irvine
 */
public class A175629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175629() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {0, 1, 1, -1, 1, -1});
  }
}
