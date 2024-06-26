package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-06-12/multrar at 2024-06-12 23:13

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A363339 G.f. satisfies A(x) = exp( Sum_{k&gt;=1} (-1)^(k+1) * A(x^(4*k)) * x^k/k ).
 * @author Georg Fischer
 */
public class A363339 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A363339() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> Integers.SINGLETON.sumdiv(k, d -> (d % 4 != 1) ? Z.ZERO : Z.NEG_ONE.pow(k / d + 1).multiply(d).multiply(self.a(d / 4))).multiply(self.a(n - k))).divide(n), "1");
  }
}
