package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242181 Numbers with four X's in Roman numerals.
 * @author Sean A. Irvine
 */
public class A242181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242181() {
    super(new long[] {-1, 2}, new long[] {39, 89});
  }
}
