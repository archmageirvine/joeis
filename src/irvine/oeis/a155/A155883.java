package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155883 The sequence gives the three-dimensional forms of the centered hexagonal numbers. Two examples: its third term 173 is built 19 + 37 + 61 + 37 + 19 and its fourth term 505 is built 37 + 61 + 91 + 127 + 91 + 61 + 37.
 * @author Sean A. Irvine
 */
public class A155883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155883() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 33, 173, 505});
  }
}
