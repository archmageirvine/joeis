package irvine.oeis.a336;
// Generated by gen_seq4.pl 2025-04-09.ack/multia at 2025-04-09 21:37

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A336271 a(0) = 1; a(n) = Sum_{k=1..n} (-1)^(k+1) * binomial(n,k)^2 * binomial(2*k,k) * a(n-k).
 * @author Georg Fischer
 */
public class A336271 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A336271() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> Z.NEG_ONE.pow(k + 1).multiply(Binomial.binomial(n, k).square()).multiply(Binomial.binomial(2 * k, k)).multiply(self.a(n - k))), "1");
  }
}
