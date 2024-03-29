package irvine.oeis.a180;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a001.A001654;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A180663 Mirror image of the Golden Triangle: T(n,k) = A001654(n-k) for n&gt;=0 and 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A180663 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A180663() {
    super(0, new A001654());
  }
}

