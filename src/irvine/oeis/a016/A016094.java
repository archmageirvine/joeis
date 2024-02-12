package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016094 Expansion of 1/((1-9*x)*(1-10*x)*(1-11*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016094() {
    super(new long[] {-11880, 4578, -659, 42}, new long[] {1, 42, 1105, 23310});
  }
}
