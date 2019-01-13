package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227703.
 * @author Sean A. Irvine
 */
public class A227703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227703() {
    super(new long[] {-1, 4, -6, 4}, new long[] {52, 150, 328, 610});
  }
}
