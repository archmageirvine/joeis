package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118648.
 * @author Sean A. Irvine
 */
public class A118648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118648() {
    super(new long[] {-2, 1, 0, -2, 3}, new long[] {11, 25, 54, 114, 237});
  }
}
