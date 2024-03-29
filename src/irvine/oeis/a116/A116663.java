package irvine.oeis.a116;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a087.A087897;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A116663 Triangle read by rows: T(n,k) = number of partitions of n into odd parts and having exactly k parts equal to 1 (n&gt;=0, 1&lt;=k&lt;=n).
 * @author Georg Fischer
 */
public class A116663 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A116663() {
    super(0, new A087897());
  }
}

