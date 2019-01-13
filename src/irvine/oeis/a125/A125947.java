package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125947.
 * @author Sean A. Irvine
 */
public class A125947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125947() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {9, 81, 729, 6513, 57369, 495921, 4194969});
  }
}
