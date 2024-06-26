package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-06-12/multrar at 2024-06-12 23:13

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A363579 G.f. satisfies A(x) = exp( Sum_{k&gt;=1} ((-3)^k + A(x^k)) * x^k/k ).
 * @author Georg Fischer
 */
public class A363579 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A363579() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(-3).pow(k).add(Integers.SINGLETON.sumdiv(k, d -> Z.valueOf(d).multiply(self.a(d - 1)))).multiply(self.a(n - k))).divide(n), "1");
  }
}
