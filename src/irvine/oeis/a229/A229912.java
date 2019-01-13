package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229912.
 * @author Sean A. Irvine
 */
public class A229912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229912() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {0, 3, 3, 10, 21});
  }
}
