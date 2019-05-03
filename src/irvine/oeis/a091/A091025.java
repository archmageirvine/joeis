package irvine.oeis.a091;

import irvine.oeis.FiniteSequence;

/**
 * A091025 Smallest positive k such that <code>phi(1+k*2^m) &lt;= phi(k*2^m)</code> for all m <code>= n (mod 12)</code>, where phi is Euler's totient function.
 * @author Georg Fischer
 */
public class A091025 extends FiniteSequence {

  /** Construct the sequence. */
  public A091025() {
    super(104, 52, 26, 13, 59, 82, 41, 73, 89, 97, 101, 103);
  }
}
