package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019687 Expansion of <code>1/((1-4x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A019687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019687() {
    super(new long[] {396, -179, 24}, new long[] {1, 24, 397});
  }
}
