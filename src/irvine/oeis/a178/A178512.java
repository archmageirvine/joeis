package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178512.
 * @author Sean A. Irvine
 */
public class A178512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178512() {
    super(new long[] {-120, 121}, new long[] {1, 121});
  }
}
