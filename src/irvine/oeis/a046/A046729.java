package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046729 Expansion of 4*x/((1+x)*(1-6*x+x^2)).
 * @author Sean A. Irvine
 */
public class A046729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046729() {
    super(new long[] {-1, 5, 5}, new long[] {0, 4, 20});
  }
}
