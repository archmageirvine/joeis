package irvine.oeis.a054;
// Generated by gen_seq4.pl triselect

import irvine.oeis.triangle.TriangleSelector;

/**
 * A054140 T(2n+1,n), array T as in A054134.
 * @author Georg Fischer
 */
public class A054140 extends TriangleSelector {

  /** Construct the sequence. */
  public A054140() {
    super(0, new A054134(), 0, n -> new int[]{2 * n + 1, n});
  }
}

