package irvine.oeis.a384;

import irvine.oeis.NoncomputableSequence;

/**
 * A384766 Instruction-Limited Symbols Busy Beaver Sequence: Sigma_i(n). Maximum number of non-blank symbols that an n-instruction Turing machine (allowing any number of states and symbols) can leave on an initially blank tape before eventually halting.
 * @author Gregory Morse
 */
public class A384766 extends NoncomputableSequence {
  // Known exact maxima; later champions in the OEIS entry are lower bounds only.
  /** Construct the sequence. */
  public A384766() {
    super(0, NONCOMPUTABLE, 0, 1, 2, 4, 5, 9, 14, 2050);
  }
}
