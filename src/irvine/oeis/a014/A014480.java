package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014480 Expansion of (1+2*x)/(1-2*x)^2.
 * @author Sean A. Irvine
 */
public class A014480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014480() {
    super(new long[] {-4, 4}, new long[] {1, 6});
  }
}
