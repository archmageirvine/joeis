package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078039.
 * @author Sean A. Irvine
 */
public class A078039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078039() {
    super(new long[] {-1, 2, -1}, new long[] {1, -2, 4});
  }
}
