package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140345.
 * @author Sean A. Irvine
 */
public class A140345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140345() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, -2});
  }
}
