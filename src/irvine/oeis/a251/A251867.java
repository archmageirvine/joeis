package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251867.
 * @author Sean A. Irvine
 */
public class A251867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251867() {
    super(new long[] {1, -35, 35}, new long[] {0, 14, 492});
  }
}
