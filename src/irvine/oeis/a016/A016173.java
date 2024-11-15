package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016173 Expansion of 1/((1-6*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016173() {
    super(new long[] {-60, 16}, new long[] {1, 16});
  }
}
