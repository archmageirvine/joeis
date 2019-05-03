package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214345 Interleaved reading of <code>A073577</code> and <code>A053755</code>.
 * @author Sean A. Irvine
 */
public class A214345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214345() {
    super(new long[] {1, -2, 0, 2}, new long[] {5, 7, 17, 23});
  }
}
