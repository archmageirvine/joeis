package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037521 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 2, 1, 0.
 * @author Sean A. Irvine
 */
public class A037521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037521() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 9, 36, 146});
  }
}
