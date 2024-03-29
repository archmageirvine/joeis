package irvine.oeis.a340;
// Generated by gen_seq4.pl 2024-01-16/moetrafi at 2024-01-19 19:57

import irvine.oeis.a063.A063994;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A340192 a(n) = Sum_{d|n} A063994(d), where A063994(x) = Product_{primes p dividing x} gcd(p-1, x-1).
 * @author Georg Fischer
 */
public class A340192 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A340192() {
    super(1, new A063994(), 0);
    next();
  }
}
