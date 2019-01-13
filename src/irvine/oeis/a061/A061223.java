package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061223.
 * @author Sean A. Irvine
 */
public class A061223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061223() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {33, 260, 1113, 3408, 8465, 18228});
  }
}
