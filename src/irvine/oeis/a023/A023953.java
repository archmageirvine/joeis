package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023953 Expansion of g.f. 1/((1-x)*(1-6*x)*(1-7*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A023953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023953() {
    super(new long[] {-504, 702, -223, 26}, new long[] {1, 26, 453, 6682});
  }
}
