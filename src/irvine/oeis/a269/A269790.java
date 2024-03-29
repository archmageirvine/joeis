package irvine.oeis.a269;
// Generated by gen_seq4.pl A114350/parmof3 at 2023-08-16 21:40

import irvine.oeis.a114.A114350;

/**
 * A269790 Primes p such that 2*p + 79 is a square.
 * @author Georg Fischer
 */
public class A269790 extends A114350 {

  /** Construct the sequence. */
  public A269790() {
    super(1, 1, x -> x.square().multiply(2).add(x.multiply(+2)).add(-39));
  }
}
