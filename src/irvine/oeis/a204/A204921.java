package irvine.oeis.a204;
// Generated by gen_seq4.pl A204892/parm4 at 2022-05-02 19:06

import irvine.oeis.a001.A001248;

/**
 * A204921 a(n) = (p(n)^2 - q(n)^2)/n, where (p(n)^2, q(n)^2) is the least pair of squared primes (ordered as at A204914) for which n divides p(n)^2 - q(n)^2.
 * @author Georg Fischer
 */
public class A204921 extends A204892 {

  /** Construct the sequence. */
  public A204921() {
    super(new A001248(), 1, 6);
  }
}
