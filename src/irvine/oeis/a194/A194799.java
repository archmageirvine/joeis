package irvine.oeis.a194;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a187.A187219;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A194799 Triangle read by rows: T(n,k) = number of partitions of n that are formed by k sections, k &gt;= 1.
 * @author Georg Fischer
 */
public class A194799 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A194799() {
    super(1, new A187219());
  }
}

