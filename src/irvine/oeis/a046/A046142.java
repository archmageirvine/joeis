package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046142 Ha\u00fcy rhombic dodecahedral numbers.
 * @author Sean A. Irvine
 */
public class A046142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046142() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 33, 185, 553});
  }
}
