package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-01-01.ack/moetrafi at 2025-01-01 23:25

import irvine.oeis.a377.A377874;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A378445 a(n) is the number of divisors d of n such that A083345(d) is odd, where A083345(n) is the numerator of Sum(e/p: n=Product(p^e)).
 * @author Georg Fischer
 */
public class A378445 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A378445() {
    super(1, new A377874(), 0);
    next();
  }
}
