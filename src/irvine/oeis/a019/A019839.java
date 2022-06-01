package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019839 Expansion of 1/((1-5x)(1-6x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A019839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019839() {
    super(new long[] {300, -140, 21}, new long[] {1, 21, 301});
  }
}
