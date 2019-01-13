package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164604.
 * @author Sean A. Irvine
 */
public class A164604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164604() {
    super(new long[] {-1, 6}, new long[] {1, 19});
  }
}
