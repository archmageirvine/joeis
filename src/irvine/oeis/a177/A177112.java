package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177112 4*(10^n-7).
 * @author Sean A. Irvine
 */
public class A177112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177112() {
    super(1, new long[] {-10, 11}, new long[] {12, 372});
  }
}
