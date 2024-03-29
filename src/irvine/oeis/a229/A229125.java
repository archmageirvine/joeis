package irvine.oeis.a229;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a007.A007913;

/**
 * A229125 Numbers of the form p * m^2, where p is prime and m &gt; 0: union of A228056 and A000040.
 * @author Georg Fischer
 */
public class A229125 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A229125() {
    super(1, 1, new A007913(), PRIME);
  }
}
