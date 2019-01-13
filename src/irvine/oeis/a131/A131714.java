package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131714.
 * @author Sean A. Irvine
 */
public class A131714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131714() {
    super(new long[] {-1, 0, 0}, new long[] {1, -2, 2});
  }
}
