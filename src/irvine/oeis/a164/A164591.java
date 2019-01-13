package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164591.
 * @author Sean A. Irvine
 */
public class A164591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164591() {
    super(new long[] {-8, 8}, new long[] {1, 7});
  }
}
