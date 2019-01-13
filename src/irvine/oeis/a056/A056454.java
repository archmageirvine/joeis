package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056454.
 * @author Sean A. Irvine
 */
public class A056454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056454() {
    super(new long[] {6, -6, -5, 5, 1}, new long[] {0, 0, 0, 0, 6});
  }
}
