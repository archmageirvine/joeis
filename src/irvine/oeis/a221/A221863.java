package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221863.
 * @author Sean A. Irvine
 */
public class A221863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221863() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 6, 27, 110, 429});
  }
}
