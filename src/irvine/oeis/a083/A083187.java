package irvine.oeis.a083;
// Generated by gen_seq4.pl charfun at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a002.A002379;

/**
 * A083187 a(n) = floor(log_3/2(n+1)) - floor(log_3/2(n)).
 * @author Georg Fischer
 */
public class A083187 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A083187() {
    super(0, new A002379());
    next();
  }
}
