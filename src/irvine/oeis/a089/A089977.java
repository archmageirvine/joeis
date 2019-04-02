package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089977 Expansion of 1/((1-2*x)*(1+x+2*x^2)).
 * @author Sean A. Irvine
 */
public class A089977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089977() {
    super(new long[] {4, 0, 1}, new long[] {1, 1, 1});
  }
}
