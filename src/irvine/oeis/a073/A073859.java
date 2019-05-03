package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073859 <code>a(1)=1</code> and <code>a(n&gt;1)=min{primes</code> up to <code>n-1 | a(1)+a(2)+...+a(n-1)+a(n)</code> is a <code>cube}</code>.
 * @author Georg Fischer
 */
public class A073859 extends FiniteSequence {

  /** Construct the sequence. */
  public A073859() {
    super(1, 7, 19, 37, 61);
  }
}
