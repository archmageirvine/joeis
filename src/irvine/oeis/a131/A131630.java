package irvine.oeis.a131;

import irvine.oeis.FiniteSequence;

/**
 * A131630 Consider the AES (or Rijndael) S-boxes and concatenate i and <code>sbox[i]</code> for all i. Then <code>a(n)</code> is the number of these pairs at Hamming distance n from <code>0, sbox[0]</code>.
 * @author Georg Fischer
 */
public class A131630 extends FiniteSequence {

  /** Construct the sequence. */
  public A131630() {
    super(1, 0, 0, 3, 7, 18, 41, 44, 34, 33, 40, 26, 6, 2, 1, 0, 0);
  }
}
