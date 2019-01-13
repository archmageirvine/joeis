package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135365.
 * @author Sean A. Irvine
 */
public class A135365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135365() {
    super(new long[] {3, -1, 0, 3}, new long[] {1, 3, 9, 11});
  }
}
