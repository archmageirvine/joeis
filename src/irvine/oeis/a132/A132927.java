package irvine.oeis.a132;
// Generated by gen_seq4.pl concatf at 2022-12-30 21:49

import irvine.oeis.a000.A000005;
import irvine.oeis.a118.A118385;

/**
 * A132927 Concatenation of first n elements of the divisor function d(n), where d(n) is the number of divisors of n.
 * @author Georg Fischer
 */
public class A132927 extends A118385 {

  /** Construct the sequence. */
  public A132927() {
    super(1, new A000005(), 10);
  }
}
