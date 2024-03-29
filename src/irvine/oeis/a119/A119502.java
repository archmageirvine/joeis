package irvine.oeis.a119;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a000.A000142;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A119502 Triangle read by rows, T(n,k) = (n-k)!, for n&gt;=0 and 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A119502 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A119502() {
    super(0, new A000142());
  }
}

