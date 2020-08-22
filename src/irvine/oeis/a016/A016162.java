package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016162 Expansion of 1/((1-5x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016162() {
    super(new long[] {-40, 13}, new long[] {1, 13});
  }
}
