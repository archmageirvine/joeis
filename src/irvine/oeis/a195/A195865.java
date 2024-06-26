package irvine.oeis.a195;
// Generated by gen_seq4.pl 2024-06-12/multrar at 2024-06-12 23:13

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A195865 G.f. satisfies A(x) = exp( Sum_{n&gt;=1} (A(x^n) + A(-x^n))/2 * x^n/n ).
 * @author Georg Fischer
 */
public class A195865 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A195865() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> Integers.SINGLETON.sumdiv(k, d -> (d & 1) != 1 ? Z.ZERO : Z.valueOf(d).multiply(self.a(d - 1))).multiply(self.a(n - k))).divide(n), "1");
  }
}
