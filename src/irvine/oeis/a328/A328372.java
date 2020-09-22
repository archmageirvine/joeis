package irvine.oeis.a328;
// Generated by gen_seq4.pl moebiusix 1 A143259 1 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a143.A143259;


/**
 * A328372 Expansion of Sum_{k>=1} x^(k^2) / (1 - x^(2*k^2)).
 * @author Georg Fischer
 */
public class A328372 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A328372() {
    super(new A143259(), 0);
    next();
  }
}
