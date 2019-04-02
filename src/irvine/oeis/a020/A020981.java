package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020981 Expansion of 1/((1-8*x)*(1-11*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020981() {
    super(new long[] {1056, -316, 31}, new long[] {1, 31, 645});
  }
}
