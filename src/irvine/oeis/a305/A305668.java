package irvine.oeis.a305;

import irvine.oeis.FiniteSequence;

/**
 * A305668 Engel expansion whose sum has the concatenation of its terms as decimal part. Case a(1) = 10.
 * @author Georg Fischer
 */
public class A305668 extends FiniteSequence {

  /** Construct the sequence. */
  public A305668() {
    super(10, 100, 316, 5169, 183766, 972915, 8110039);
  }
}
