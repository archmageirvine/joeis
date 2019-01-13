package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095262.
 * @author Sean A. Irvine
 */
public class A095262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095262() {
    super(new long[] {24, -26, 9}, new long[] {2, 21, 137});
  }
}
