package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178512 Reversed decimal expansions of A178510.
 * @author Sean A. Irvine
 */
public class A178512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178512() {
    super(new long[] {-120, 121}, new long[] {1, 121});
  }
}
