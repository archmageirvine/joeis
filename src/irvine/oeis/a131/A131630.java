package irvine.oeis.a131;

import irvine.oeis.FiniteSequence;

/**
 * A131630 Consider the AES (or Rijndael) S-boxes and concatenate i and sbox[i] for all i. Then a(n) is the number of these pairs at Hamming distance n from 0, sbox[0].
 * @author Georg Fischer
 */
public class A131630 extends FiniteSequence {

  /** Construct the sequence. */
  public A131630() {
    super(1, 0, 0, 3, 7, 18, 41, 44, 34, 33, 40, 26, 6, 2, 1, 0, 0);
  }
}
