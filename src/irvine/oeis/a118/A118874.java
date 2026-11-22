package irvine.oeis.a118;

import irvine.oeis.NoncomputableSequence;

/**
 * A118874 A halting sequence: let f_n be the n-th recursive function, relative to the Godel numbering given in Cutland, then a(n) is f_n(n)+1 if the corresponding program halts on input n, 0 otherwise.
 * @author Gregory Morse
 */
public class A118874 extends NoncomputableSequence {
  // Published values for Cutland's numbering.
  /** Construct the sequence. */
  public A118874() {
    super(0, NONCOMPUTABLE, 1, 3, 1, 4, 2, 1, 1, 0, 1, 12, 2, 1, 1, 1, 1, 16, 0, 19, 1, 21, 3, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 32, 1, 0, 0, 36, 2, 1, 1, 0, 2, 45, 3, 2, 2, 2, 2, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 64, 1, 67, 1, 0, 0, 0, 0, 0, 1, 76, 2, 1, 1, 1, 1, 81, 0, 84, 2, 86, 4, 3, 3, 0, 2, 2, 2, 2, 2, 2, 2, 1, 1, 0, 0);
  }
}
