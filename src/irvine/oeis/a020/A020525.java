package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020525.
 * @author Sean A. Irvine
 */
public class A020525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020525() {
    super(new long[] {-2048, 2752, -756, 53}, new long[] {1, 3, 847, 45375});
  }
}
