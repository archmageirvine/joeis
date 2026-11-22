package irvine.oeis.a333;

import irvine.oeis.NoncomputableSequence;

/**
 * A333958 The number of closed lambda calculus terms of size n that have a normal form, where size(lambda M)=2+size(M), size(M N)=2+size(M)+size(N), and size(V)=1+i for a variable V bound by the i-th enclosing lambda.
 * @author Gregory Morse
 */
public class A333958 extends NoncomputableSequence {
  // Known counts; see John Tromp's binary lambda calculus computation in the OEIS entry.
  /** Construct the sequence. */
  public A333958() {
    super(1, NONCOMPUTABLE, 0, 0, 0, 1, 0, 1, 1, 2, 1, 6, 5, 13, 14, 37, 44, 101, 134, 297, 431, 882, 1361, 2729, 4405, 8549, 14311, 27400, 47101, 89022, 156080, 293014, 521730, 975507, 1757787, 3278660, 5961402, 11112179);
  }
}
