package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083067 6th row of number array A083064.
 * @author Sean A. Irvine
 */
public class A083067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083067() {
    super(new long[] {-7, 8}, new long[] {1, 6});
  }
}
