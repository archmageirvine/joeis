package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275788.
 * @author Sean A. Irvine
 */
public class A275788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275788() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 1, 3, 7});
  }
}
