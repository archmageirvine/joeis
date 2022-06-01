package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029546 Expansion of 1/( (1-x)*(1-34*x+x^2) ).
 * @author Sean A. Irvine
 */
public class A029546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029546() {
    super(new long[] {1, -35, 35}, new long[] {1, 35, 1190});
  }
}
