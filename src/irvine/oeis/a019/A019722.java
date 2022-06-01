package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019722 Expansion of 1/((1-4x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A019722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019722() {
    super(new long[] {432, -192, 25}, new long[] {1, 25, 433});
  }
}
