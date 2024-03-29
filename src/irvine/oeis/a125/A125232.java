package irvine.oeis.a125;
// Generated by gen_seq4.pl tricut1

import irvine.oeis.a135.A135857;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A125232 Triangle T(n,k) read by rows: the (n-k)-th term of the k-fold iterated partial sum of the pentagonal numbers.
 * @author Georg Fischer
 */
public class A125232 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A125232() {
    super(1, new A135857());
  }
}

