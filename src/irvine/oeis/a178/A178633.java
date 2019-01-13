package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178633.
 * @author Sean A. Irvine
 */
public class A178633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178633() {
    super(new long[] {1000, -1110, 111}, new long[] {54, 6534, 665334});
  }
}
