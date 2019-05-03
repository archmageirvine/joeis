package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132366 Partial sum of centered tetrahedral numbers <code>A005894</code>.
 * @author Sean A. Irvine
 */
public class A132366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132366() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 21, 56, 125});
  }
}
