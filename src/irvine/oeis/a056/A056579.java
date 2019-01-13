package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056579.
 * @author Sean A. Irvine
 */
public class A056579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056579() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 15, 129, 547, 1593});
  }
}
