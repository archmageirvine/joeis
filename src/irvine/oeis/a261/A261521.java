package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261521.
 * @author Sean A. Irvine
 */
public class A261521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261521() {
    super(new long[] {1, -3, 3}, new long[] {29, 32, 37});
  }
}
