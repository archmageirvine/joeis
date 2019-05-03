package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074149 Sum of terms in each group in <code>A074147</code>.
 * @author Sean A. Irvine
 */
public class A074149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074149() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 6, 15, 36, 65, 114});
  }
}
