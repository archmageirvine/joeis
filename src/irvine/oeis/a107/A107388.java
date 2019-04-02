package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107388 Expansion of x*(3*x-1)*(2*x-1) / ( (1-x)*(1+x)*(x^2-4*x+1) ).
 * @author Sean A. Irvine
 */
public class A107388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107388() {
    super(new long[] {1, -4, 0, 4}, new long[] {0, 1, -1, 2});
  }
}
