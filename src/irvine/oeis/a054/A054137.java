package irvine.oeis.a054;
// Generated by gen_seq4.pl triselect

import irvine.oeis.triangle.TriangleSelector;

/**
 * A054137 T(n,3), array T as in A054134.
 * @author Georg Fischer
 */
public class A054137 extends TriangleSelector {

  /** Construct the sequence. */
  public A054137() {
    super(3, new A054134(), 0, n -> new int[]{n, 3});
  }
}

