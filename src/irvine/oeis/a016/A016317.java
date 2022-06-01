package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016317 Expansion of 1/((1-2x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016317() {
    super(new long[] {160, -116, 20}, new long[] {1, 20, 284});
  }
}
