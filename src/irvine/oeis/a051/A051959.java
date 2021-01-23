package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051959 Expansion of (1+6x)/( (1-2x-x^2)(1-x)^2).
 * @author Sean A. Irvine
 */
public class A051959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051959() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 10, 36, 104});
  }
}
