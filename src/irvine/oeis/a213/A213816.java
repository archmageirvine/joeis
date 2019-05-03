package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213816 Tribonacci sequences <code>A000073</code> and <code>A001590</code> interleaved.
 * @author Sean A. Irvine
 */
public class A213816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213816() {
    super(new long[] {1, 0, 1, 0, 1, 0}, new long[] {1, 1, 1, 2, 2, 3});
  }
}
