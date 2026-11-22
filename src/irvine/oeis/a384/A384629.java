package irvine.oeis.a384;

import irvine.oeis.NoncomputableSequence;

/**
 * A384629 Instruction-Limited Busy Beaver Sequence: BBi(n). Maximum number of steps that an n-instruction Turing machine (allowing any number of states and symbols) can take on an initially blank tape before eventually halting.
 * @author Gregory Morse
 */
public class A384629 extends NoncomputableSequence {
  // Known exact maxima; later champions in the OEIS entry are lower bounds only.
  /** Construct the sequence. */
  public A384629() {
    super(0, NONCOMPUTABLE, 0, 1, 3, 5, 16, 37, 123, 3932963);
  }
}
