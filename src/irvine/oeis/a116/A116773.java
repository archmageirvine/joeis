package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116773.
 * @author Sean A. Irvine
 */
public class A116773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116773() {
    super(new long[] {-4, 24, -53, 57, -32, 9}, new long[] {1, 2, 6, 21, 73, 241});
  }
}
