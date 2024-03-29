package irvine.oeis.a323;
// Generated by gen_seq4.pl charfun at 2023-09-18 22:41
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a064.A064594;

/**
 * A323154 a(n) = 1 if n divides A048146(n) = (sigma(n)-usigma(n)), 0 otherwise.
 * @author Georg Fischer
 */
public class A323154 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A323154() {
    super(1, new A064594());
  }
}
