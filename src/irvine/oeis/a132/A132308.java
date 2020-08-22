package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132308 2*3^n - n - 1.
 * @author Sean A. Irvine
 */
public class A132308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132308() {
    super(new long[] {3, -7, 5}, new long[] {1, 4, 15});
  }
}
