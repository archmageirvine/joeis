package irvine.oeis.a229;
// Generated by gen_seq4.pl charfun at 2020-09-22 11:53
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a001.A001481;

/**
 * A229062 1 if n is representable as sum of two nonnegative squares, otherwise 0.
 * @author Georg Fischer
 */
public class A229062 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A229062() {
    super(0, new A001481());
  }
}
