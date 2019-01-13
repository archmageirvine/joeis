package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020876.
 * @author Sean A. Irvine
 */
public class A020876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020876() {
    super(new long[] {-5, 5}, new long[] {2, 5});
  }
}
