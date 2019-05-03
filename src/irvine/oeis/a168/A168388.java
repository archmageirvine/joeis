package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168388 First number in the n-th row of <code>A172002</code>.
 * @author Sean A. Irvine
 */
public class A168388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168388() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 3, 5, 13, 21, 39});
  }
}
