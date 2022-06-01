package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173393 10n+12^n.
 * @author Sean A. Irvine
 */
public class A173393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173393() {
    super(new long[] {12, -25, 14}, new long[] {22, 164, 1758});
  }
}
