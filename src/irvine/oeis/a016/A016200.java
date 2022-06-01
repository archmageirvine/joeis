package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016200 Expansion of 1/((1-x)(1-2x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A016200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016200() {
    super(new long[] {12, -20, 9}, new long[] {1, 9, 61});
  }
}
