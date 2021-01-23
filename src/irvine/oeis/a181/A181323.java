package irvine.oeis.a181;

import irvine.oeis.FiniteSequence;

/**
 * A181323 Number of ways of placing n rods of length 3 in a 3x3x3 cubic lattice without any two rods intersecting (0 &lt;= n &lt;= 9).
 * @author Georg Fischer
 */
public class A181323 extends FiniteSequence {

  /** Construct the sequence. */
  public A181323() {
    super(1, 27, 270, 1278, 3078, 3888, 2592, 918, 189, 21);
  }
}
