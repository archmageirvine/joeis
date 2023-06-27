package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100152 Structured truncated cubic numbers.
 * @author Sean A. Irvine
 */
public class A100152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100152() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 24, 100, 260});
  }
}
