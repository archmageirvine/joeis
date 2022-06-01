package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177098 6*(10^n-7).
 * @author Sean A. Irvine
 */
public class A177098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177098() {
    super(new long[] {-10, 11}, new long[] {18, 558});
  }
}
