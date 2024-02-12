package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016188 Expansion of 1/((1-8*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016188() {
    super(new long[] {-96, 20}, new long[] {1, 20});
  }
}
