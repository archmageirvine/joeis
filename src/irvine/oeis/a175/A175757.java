package irvine.oeis.a175;
// Generated by gen_seq4.pl tricut1

import irvine.oeis.a056.A056857;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A175757 Triangular array read by rows: T(n,k) is the number of blocks of size k in all set partitions of {1,2,...,n}.
 * @author Georg Fischer
 */
public class A175757 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A175757() {
    super(1, new A056857());
  }
}

