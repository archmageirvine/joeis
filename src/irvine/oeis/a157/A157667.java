package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157667.
 * @author Sean A. Irvine
 */
public class A157667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157667() {
    super(new long[] {1, -3, 3}, new long[] {48842, 902501, 2819042});
  }
}
