package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155883.
 * @author Sean A. Irvine
 */
public class A155883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155883() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 33, 173, 505});
  }
}
