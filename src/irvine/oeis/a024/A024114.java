package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024114.
 * @author Sean A. Irvine
 */
public class A024114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024114() {
    super(new long[] {-576, 792, -242, 27}, new long[] {1, 27, 487, 7407});
  }
}
