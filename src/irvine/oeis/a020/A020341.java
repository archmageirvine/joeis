package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020341 Expansion of 1/((1-5x)(1-7x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A020341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020341() {
    super(new long[] {420, -179, 24}, new long[] {1, 24, 397});
  }
}
