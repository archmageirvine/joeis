package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139593 A139276(n) followed by A139272(n+1).
 * @author Sean A. Irvine
 */
public class A139593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139593() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 11, 22});
  }
}
