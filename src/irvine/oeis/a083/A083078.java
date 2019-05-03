package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083078 6th row of number array <code>A083075</code>.
 * @author Sean A. Irvine
 */
public class A083078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083078() {
    super(new long[] {-13, 14}, new long[] {1, 11});
  }
}
