package irvine.oeis.a337;
// Generated by gen_seq4.pl 2024-05-29/multrar at 2024-05-29 02:16

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A337186 a(n) = 1 + Sum_{k=0..n-2} binomial(n-2,k) * a(k).
 * @author Georg Fischer
 */
public class A337186 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A337186() {
    super(0, (self, n) -> Z.ONE.add(Integers.SINGLETON.sum(0, n - 2, k -> Binomial.binomial(n - 2, k).multiply(self.a(k)))), "");
  }
}
