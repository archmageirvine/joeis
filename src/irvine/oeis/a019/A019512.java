package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019512 Expansion of 1/((1-4x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A019512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019512() {
    super(new long[] {224, -116, 19}, new long[] {1, 19, 245});
  }
}
