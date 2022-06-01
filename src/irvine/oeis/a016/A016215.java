package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016215 Expansion of 1/((1-x)(1-3x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016215() {
    super(new long[] {30, -43, 14}, new long[] {1, 14, 153});
  }
}
