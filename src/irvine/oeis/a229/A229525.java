package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229525.
 * @author Sean A. Irvine
 */
public class A229525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229525() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {11, 5, 31, 11, 59, 19});
  }
}
