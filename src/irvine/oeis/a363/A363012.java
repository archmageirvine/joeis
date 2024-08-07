package irvine.oeis.a363;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.oeis.MultiplicativeSequence;

/**
 * A363012 a(n) = Sum_{d|n} d*tau(d)*phi(d)*mu(n/d).
 * Multiplicative with: a(p) = 2*p^2 - 2*p - 1 and a(p^e) = ((p^2 - 1)*e + p^2)*(p - 1)*p^(2*e - 3) for e > 1.
 * @author Georg Fischer
 */
public class A363012 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A363012() {
    super(1, (p, e) -> (e == 1) ? p.multiply(p.subtract(1).multiply2()).subtract(1) : p.square().add(-1).multiply(e).add(p.square()).multiply(p.add(-1)).multiply(p.pow(2L * e - 3)));
  }
}
