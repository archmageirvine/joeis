package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053536 Expansion of 1/((1+4*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A053536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053536() {
    super(new long[] {48, 8}, new long[] {1, 8});
  }
}
