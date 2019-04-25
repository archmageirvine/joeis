package irvine.oeis.a177;

import irvine.oeis.FiniteSequence;

/**
 * A177772 Base 10 numbers d_1 d_2 <code>...</code> d_k such that the digits d_i are distinct, and <code>Sum_{i=1..k-1}</code> d_i^i = d_k^k.
 * @author Georg Fischer
 */
public class A177772 extends FiniteSequence {

  /** Construct the sequence. */
  public A177772() {
    super(42, 93, 253, 712, 802, 6312, 7302, 9823, 25603, 40312, 41302, 65012, 65102, 714523, 781523, 804523, 65072413, 65172403);
  }
}
