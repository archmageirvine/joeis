package irvine.oeis.a368;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A368052 The degree of polynomials related to Somos-4 sequences. Also for n &gt; 2 the degree of the (n-3)-th involution in a family of involutions in the Cremona group of rank 3 defined by a Somos-4 sequence.
 * @author Georg Fischer
 */
public class A368052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A368052() {
    super(0, new long[] {1, -3, 3, -1, 1, -3, 3}, new long[] {0, 0, 0, 0, 2, 3, 5});
  }
}
