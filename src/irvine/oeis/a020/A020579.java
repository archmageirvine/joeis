package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020579.
 * @author Sean A. Irvine
 */
public class A020579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020579() {
    super(new long[] {432, -174, 23}, new long[] {1, 23, 355});
  }
}
