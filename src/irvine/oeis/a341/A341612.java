package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-02-22/charfunc at 2024-02-22 20:18

import irvine.oeis.CharacteristicFunction;

/**
 * A341612 Characteristic function of A341614: a(n) = 1 if sigma(n) &lt;= 2n &lt; A003961(n), 0 otherwise.
 * @author Georg Fischer
 */
public class A341612 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A341612() {
    super(1, new A341614());
  }
}
