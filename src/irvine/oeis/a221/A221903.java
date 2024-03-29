package irvine.oeis.a221;
// Generated by gen_seq4.pl A114350/parmof3 at 2023-08-16 21:40

import irvine.oeis.a114.A114350;

/**
 * A221903 Primes of the form 2*n^2 + 42*n + 19.
 * @author Georg Fischer
 */
public class A221903 extends A114350 {

  /** Construct the sequence. */
  public A221903() {
    super(1, 1, x -> x.square().multiply(2).add(x.multiply(+42)).add(+19));
  }
}
