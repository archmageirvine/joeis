package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194274 Concentric square numbers (see Comments lines for definition).
 * @author Sean A. Irvine
 */
public class A194274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194274() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 1, 4, 8, 12});
  }
}
