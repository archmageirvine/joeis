package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216173.
 * @author Sean A. Irvine
 */
public class A216173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216173() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {1, 5, 16, 39, 80, 147, 249});
  }
}
