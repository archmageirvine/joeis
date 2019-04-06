package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073859 a(1)=1 and a(n&gt;1)=min{primes up to n-1 | a(1)+a(2)+...+a(n-1)+a(n) is a cube}.
 * @author Georg Fischer
 */
public class A073859 extends FiniteSequence {

  /** Construct the sequence. */
  public A073859() {
    super(1, 7, 19, 37, 61);
  }
}
