package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020343 Expansion of 1/((1-5x)(1-8x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A020343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020343() {
    super(new long[] {360, -157, 22}, new long[] {1, 22, 327});
  }
}
