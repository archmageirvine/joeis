package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134816 Padovan's spiral numbers.
 * @author Sean A. Irvine
 */
public class A134816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134816() {
    super(new long[] {1, 1, 0}, new long[] {1, 1, 1});
  }
}
