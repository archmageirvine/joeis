package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025955 Expansion of 1/((1-2*x)*(1-3*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A025955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025955() {
    super(new long[] {-660, 676, -221, 26}, new long[] {1, 26, 455, 6760});
  }
}
