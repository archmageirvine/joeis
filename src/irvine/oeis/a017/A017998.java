package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017998 Expansion of 1/((1-3x)(1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A017998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017998() {
    super(new long[] {189, -111, 19}, new long[] {1, 19, 250});
  }
}
