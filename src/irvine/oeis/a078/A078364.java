package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078364 A Chebyshev S-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078364() {
    super(new long[] {-1, 15}, new long[] {1, 15});
  }
}
