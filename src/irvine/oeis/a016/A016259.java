package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016259 Expansion of 1/((1-x)(1-8x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A016259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016259() {
    super(new long[] {88, -107, 20}, new long[] {1, 20, 293});
  }
}
