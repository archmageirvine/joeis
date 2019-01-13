package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160828.
 * @author Sean A. Irvine
 */
public class A160828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160828() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {98, 354, 978, 2258, 4578});
  }
}
