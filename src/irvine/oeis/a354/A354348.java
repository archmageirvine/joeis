package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-07-12/multrar at 2024-07-12 23:14

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a327.A327858;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A354348 Dirichlet inverse of function f(1) = 1, f(n) = gcd(A003415(n), A276086(n)) for n &gt; 1.
 * @author Georg Fischer
 */
public class A354348 extends MultiTransformSequence {

  private static final DirectSequence A327858 = new A327858();

  /** Construct the sequence. */
  public A354348() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n, d -> (d >= n) ? Z.ZERO : A327858.a(n / d).multiply(self.a(d))).negate(), "1");
  }
}
