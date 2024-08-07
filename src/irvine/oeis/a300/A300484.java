package irvine.oeis.a300;
// Generated by gen_seq4.pl 2024-07-13/lambdan at 2024-07-13 23:12

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a010.A010842;
import irvine.oeis.a127.A127672;
import irvine.oeis.triangle.DirectArray;

/**
 * A300484 a(n) = 2 * Integral_{t&gt;=0} T_n(t/2+1) * exp(-t) * dt, n&gt;=0, where T_n(x) is n-th Chebyshev polynomial of first kind.
 * @author Georg Fischer
 */
public class A300484 extends LambdaSequence {

  private static final DirectSequence A010842 = new A010842();
  private static final DirectArray A127672 = new A127672();

  /** Construct the sequence. */
  public A300484() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> A127672.a(n, i).multiply(A010842.a(i))));
  }
}
