package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231184.
 * @author Sean A. Irvine
 */
public class A231184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231184() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {-1, 0, 0, 3, 6});
  }
}
