package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161731 Expansion of (1-3*x)/(1-8*x+14*x^2).
 * @author Sean A. Irvine
 */
public class A161731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161731() {
    super(new long[] {-14, 8}, new long[] {1, 5});
  }
}
