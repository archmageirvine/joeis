package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020782 Expansion of <code>1/((1-7x)(1-8x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A020782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020782() {
    super(new long[] {504, -191, 24}, new long[] {1, 24, 385});
  }
}
