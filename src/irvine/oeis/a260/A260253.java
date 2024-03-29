package irvine.oeis.a260;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A260253 Number of symmetry-allowed, linearly-independent terms at n-th order in the expansion of E x (e+a) rovibrational perturbation matrix H(Jx,Jy,Jz).
 * @author Georg Fischer
 */
public class A260253 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A260253() {
    super(0, new long[] {1, 0, 2, 1, 2, 0, 1, 1},
      new long[] {1, 0, -2, 0, 1, 0, -1, 0, 2, 0, -1});
  }
}
