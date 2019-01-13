package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131080.
 * @author Sean A. Irvine
 */
public class A131080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131080() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {4, 4, 3, 1, 0});
  }
}
