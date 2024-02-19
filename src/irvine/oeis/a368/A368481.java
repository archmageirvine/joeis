package irvine.oeis.a368;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A368481 The degree of polynomials related to Somos-5 sequences. Also for n &gt; 4 the degree of the (n-4)-th involution in a family of involutions in the Cremona group of rank 4 defined by a Somos-5 sequence.
 * @author Georg Fischer
 */
public class A368481 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A368481() {
    super(0, "[0, 1, -1, -1, 1, 0, 0, 0, -1, 1, 1, -1]", "0, 0, 0, 0, 0, 2, 3, 4, 6, 9, 11, 14, 18, 22, 25, 30", 0);
  }
}
