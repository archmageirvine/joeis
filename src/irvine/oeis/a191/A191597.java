package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191597 Expansion of x*(1+3*x)/ ( (1-4*x)*(1+x+x^2)).
 * @author Sean A. Irvine
 */
public class A191597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191597() {
    super(new long[] {4, 3, 3}, new long[] {0, 1, 6});
  }
}
