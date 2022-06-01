package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016170 Expansion of 1/((1-6x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016170() {
    super(new long[] {-48, 14}, new long[] {1, 14});
  }
}
