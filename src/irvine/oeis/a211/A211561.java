package irvine.oeis.a211;
// Generated by gen_seq4.pl trimirr/trimirror at 2023-08-07 19:48

import irvine.oeis.a137.A137650;
import irvine.oeis.triangle.Transpose;

/**
 * A211561 T(n,k) = number of nonnegative integer arrays of length n+k-1 with new values 0 upwards introduced in order, and containing the value k-1.
 * @author Georg Fischer
 */
public class A211561 extends Transpose {

  /** Construct the sequence. */
  public A211561() {
    super(1, new A137650());
  }
}
