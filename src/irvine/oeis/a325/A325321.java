package irvine.oeis.a325;
// Generated by gen_seq4.pl robot/charfun at 2023-06-01 09:43
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a063.A063752;
/**
 * A325321 a(n) = 1 if cototient of n is a square, 0 otherwise.
 * @author Georg Fischer
 */
public class A325321 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A325321() {
    super(1, new A063752());
  }
}
