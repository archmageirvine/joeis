package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158307 <code>361n^2 - 2n</code>.
 * @author Sean A. Irvine
 */
public class A158307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158307() {
    super(new long[] {1, -3, 3}, new long[] {359, 1440, 3243});
  }
}
