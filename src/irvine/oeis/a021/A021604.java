package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021604 Expansion of 1/((1-x)*(1-3*x)*(1-7*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A021604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021604() {
    super(new long[] {-210, 331, -141, 21}, new long[] {1, 21, 300, 3670});
  }
}
