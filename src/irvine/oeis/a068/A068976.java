package irvine.oeis.a068;
// Generated by gen_seq4.pl moebiusix 1 A008833 1 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a008.A008833;


/**
 * A068976 a(n) = Sum_{d | n} d/core(d) where core(x) is the smallest number such that x*core(x) is a square.
 * @author Georg Fischer
 */
public class A068976 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A068976() {
    super(new A008833(), 0);
    next();
  }
}
