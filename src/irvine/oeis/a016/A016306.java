package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016306 Expansion of 1/((1-2*x)*(1-6*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A016306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016306() {
    super(new long[] {108, -84, 17}, new long[] {1, 17, 205});
  }
}
