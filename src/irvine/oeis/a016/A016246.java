package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016246 Expansion of 1/((1-x)(1-6x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016246() {
    super(new long[] {60, -76, 17}, new long[] {1, 17, 213});
  }
}
