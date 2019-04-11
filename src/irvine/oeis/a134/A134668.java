package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134668 Period 6: repeat <code>[1, -1, 0, 0, -1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A134668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134668() {
    super(new long[] {-1, 0, -1, 0}, new long[] {1, -1, 0, 0});
  }
}
