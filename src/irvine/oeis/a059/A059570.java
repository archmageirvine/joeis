package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059570 Number of fixed points in all 231-avoiding involutions in <code>S_n</code>.
 * @author Sean A. Irvine
 */
public class A059570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059570() {
    super(new long[] {-4, 0, 3}, new long[] {1, 2, 6});
  }
}
