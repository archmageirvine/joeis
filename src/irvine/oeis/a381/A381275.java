package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-02-22.ack/lambdan at 2025-02-22 21:47

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.LambdaSequence;

/**
 * A381275 Expansion of e.g.f. exp(x * cos(2*x)).
 * @author Georg Fischer
 */
public class A381275 extends LambdaSequence {

  /** Construct the sequence. */
  public A381275() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> new Zi(0, 2).pow(n - k).re().multiply(Integers.SINGLETON.sum(0, k, j -> Z.valueOf(2L * j - k).pow(n - k).multiply(Binomial.binomial(k, j))).multiply(Binomial.binomial(n, k)).divide(Z.TWO.pow(k)))));
  }
}
