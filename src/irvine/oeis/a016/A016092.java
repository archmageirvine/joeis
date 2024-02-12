package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016092 Expansion of 1/((1-8*x)*(1-9*x)*(1-11*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016092() {
    super(new long[] {-9504, 3900, -595, 40}, new long[] {1, 40, 1005, 20300});
  }
}
