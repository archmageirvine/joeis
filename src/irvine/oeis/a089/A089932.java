package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089932.
 * @author Sean A. Irvine
 */
public class A089932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089932() {
    super(new long[] {-2, 13, -34, 46, -30, 9}, new long[] {1, 4, 16, 60, 215, 747});
  }
}
