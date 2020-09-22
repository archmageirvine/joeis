package irvine.oeis.a327;
// Generated by gen_seq4.pl moebiusix 1 A002129 1 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a002.A002129;


/**
 * A327242 Expansion of Sum_{k>=1} tau(k) * x^k / (1 + x^k)^2, where tau = A000005.
 * @author Georg Fischer
 */
public class A327242 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A327242() {
    super(new A002129(), 0);
    next();
  }
}
