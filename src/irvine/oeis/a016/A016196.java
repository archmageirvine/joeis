package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016196 Expansion of 1/((1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016196() {
    super(new long[] {-120, 22}, new long[] {1, 22});
  }
}
