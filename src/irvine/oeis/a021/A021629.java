package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021629 Expansion of 1/((1-x)*(1-3*x)*(1-7*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A021629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021629() {
    super(new long[] {-252, 393, -163, 23}, new long[] {1, 23, 366, 5062});
  }
}
