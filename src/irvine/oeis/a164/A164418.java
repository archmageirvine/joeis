package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164418.
 * @author Sean A. Irvine
 */
public class A164418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164418() {
    super(new long[] {1, 1, 1, 1, 1, 0, 1}, new long[] {13, 22, 38, 66, 115, 200, 347});
  }
}
