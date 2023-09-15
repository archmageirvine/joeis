package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A065769 Prime cascade: multiplicative with a(p(m)^k) = p(m-1) * p(m)^(k-1).
 * @author Sean A. Irvine
 */
public class A065769 extends MultiplicativeSequence {

  private static final Fast PRIME = new Fast();

  /** Construct the sequence. */
  public A065769() {
    super(1, (p, e) -> PRIME.prevPrime(p).max(Z.ONE).multiply(p.pow(e - 1)));
  }
}
