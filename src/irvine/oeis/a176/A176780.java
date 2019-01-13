package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176780.
 * @author Sean A. Irvine
 */
public class A176780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176780() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 42, 156, 420, 930});
  }
}
