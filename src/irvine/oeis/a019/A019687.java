package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019687 Expansion of 1/((1-4x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A019687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019687() {
    super(new long[] {396, -179, 24}, new long[] {1, 24, 397});
  }
}
