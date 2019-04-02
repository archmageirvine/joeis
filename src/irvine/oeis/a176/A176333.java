package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176333 Expansion of (1-3x)/(1-4x+9x^2).
 * @author Sean A. Irvine
 */
public class A176333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176333() {
    super(new long[] {-9, 4}, new long[] {1, 1});
  }
}
