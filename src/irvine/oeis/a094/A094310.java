package irvine.oeis.a094;
// Generated by gen_seq4.pl trimirr/trimirror at 2023-08-07 19:48

import irvine.oeis.a077.A077012;
import irvine.oeis.triangle.Transpose;

/**
 * A094310 Triangle read by rows: T(n,k), the k-th term of the n-th row, is the product of all numbers from 1 to n except k: T(n,k) = n!/k.
 * @author Georg Fischer
 */
public class A094310 extends Transpose {

  /** Construct the sequence. */
  public A094310() {
    super(1, new A077012());
  }
}
