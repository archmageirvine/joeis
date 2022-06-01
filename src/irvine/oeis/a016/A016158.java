package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016158 Expansion of 1/((1-4*x)(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016158() {
    super(new long[] {-44, 15}, new long[] {1, 15});
  }
}
