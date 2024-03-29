package irvine.oeis.a078;
// Generated by gen_seq4.pl A114350/parmof3 at 2023-08-16 21:40

import irvine.oeis.a114.A114350;

/**
 * A078115 Enomial primes of order 6: primes of the form 2*x^6 + 7*x^5 + 1*x^4 + 8*x^3 + 2*x^2 + 8*x + 1 for positive integer x.
 * @author Georg Fischer
 */
public class A078115 extends A114350 {

  /** Construct the sequence. */
  public A078115() {
    super(1, 1, x -> x.pow(6).multiply(2).add(x.pow(5).multiply(7)).add(x.pow(4)).add(x.pow(3).multiply(8)).add(x.square().multiply(2)).add(x.multiply(8)).add(1));
  }
}
