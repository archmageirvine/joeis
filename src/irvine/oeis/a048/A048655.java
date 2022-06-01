package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048655 Generalized Pellian with second term equal to 5.
 * @author Sean A. Irvine
 */
public class A048655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048655() {
    super(new long[] {1, 2}, new long[] {1, 5});
  }
}
