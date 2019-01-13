package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087423.
 * @author Sean A. Irvine
 */
public class A087423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087423() {
    super(new long[] {64, -128, 32}, new long[] {32, 768, 20672});
  }
}
