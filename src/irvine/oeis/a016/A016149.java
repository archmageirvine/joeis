package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016149 Expansion of 1/((1-4*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A016149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016149() {
    super(new long[] {-24, 10}, new long[] {1, 10});
  }
}
