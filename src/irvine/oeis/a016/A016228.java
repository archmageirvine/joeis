package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016228 Expansion of 1/((1-x)*(1-5*x)(1-6*x)).
 * @author Sean A. Irvine
 */
public class A016228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016228() {
    super(new long[] {30, -41, 12}, new long[] {1, 12, 103});
  }
}
