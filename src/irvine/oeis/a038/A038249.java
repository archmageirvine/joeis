package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038249 Third line of 4-wave sequence <code>A038197</code>.
 * @author Sean A. Irvine
 */
public class A038249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038249() {
    super(new long[] {-1, 0, 7, 0, -15, 0, 10, 0}, new long[] {1, 2, 9, 19, 75, 160, 622, 1329});
  }
}
