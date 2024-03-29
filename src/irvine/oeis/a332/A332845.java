package irvine.oeis.a332;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.oeis.MultiplicativeSequence;

/**
 * A332845 a(n) = (-1)^omega(n) * Sum_{k=1..n} (-1)^omega(n/gcd(n, k)), where omega = A001221.
 * Multiplicative with: a(p^e) = p^e - 2.
 * @author Georg Fischer
 */
public class A332845 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A332845() {
    super(1, (p, e) -> p.pow(e).add(-2));
  }
}
