package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160444.
 * @author Sean A. Irvine
 */
public class A160444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160444() {
    super(new long[] {2, 0, 2, 0}, new long[] {0, 1, 1, 1});
  }
}
