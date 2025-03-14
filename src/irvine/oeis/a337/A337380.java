package irvine.oeis.a337;
// Generated by gen_seq4.pl 2025-03-06.ack/charfunc at 2025-03-06 22:47

import irvine.oeis.CharacteristicFunction;

/**
 * A337380 a(n) = 1 if A003961(n) &gt; 2*sigma(n), 0 otherwise.
 * @author Georg Fischer
 */
public class A337380 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A337380() {
    super(1, new A337378());
  }
}
