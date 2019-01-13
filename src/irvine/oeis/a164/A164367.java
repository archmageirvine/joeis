package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164367.
 * @author Sean A. Irvine
 */
public class A164367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164367() {
    super(new long[] {-1000, 110}, new long[] {101, 10010});
  }
}
