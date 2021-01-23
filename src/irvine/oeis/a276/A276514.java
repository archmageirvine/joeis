package irvine.oeis.a276;

import irvine.oeis.FiniteSequence;

/**
 * A276514 If we call "S" this sequence and consider the k-digit term a(n) of S with digits abcd...k, then a(n+1) = [a(n) + the a-th digit of S + the b-th digit of S + the c-th digit of S + ... + the k-th digit of S]. This is the lexicographically first such finite sequence with no duplicate term.
 * @author Georg Fischer
 */
public class A276514 extends FiniteSequence {

  /** Construct the sequence. */
  public A276514() {
    super(5, 10, 15, 25, 31, 36, 38, 41, 47, 53, 58, 66, 70, 75, 85, 93, 94, 96, 99, 101, 111, 126, 134, 140, 146, 154, 165, 177, 192, 199, 206, 209, 211, 222, 225, 232, 234, 236, 239, 241, 248, 253, 259, 266, 271, 282, 287, 296, 300);
  }
}
