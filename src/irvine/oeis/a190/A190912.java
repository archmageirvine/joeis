package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190912 Partial sums of pentanacci numbers <code>(A000322)</code>.
 * @author Sean A. Irvine
 */
public class A190912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190912() {
    super(new long[] {-1, 0, 0, 0, 0, 2}, new long[] {1, 2, 3, 4, 5, 10});
  }
}
