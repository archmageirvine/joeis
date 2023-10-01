package irvine.oeis.a028;

import irvine.oeis.NoncomputableSequence;

/**
 * A028444 Busy Beaver sequence, or Rado's sigma function: maximal number of 1's that an n-state Turing machine can print on an initially blank tape before halting.
 * @author Sean A. Irvine
 */
public class A028444 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A028444() {
    super(0, NONCOMPUTABLE, 0, 1, 4, 6, 13);
  }
}
