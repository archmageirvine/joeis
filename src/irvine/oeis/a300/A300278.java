package irvine.oeis.a300;
// Generated by gen_seq4.pl moebiusx 1 A022629 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.a022.A022629;


/**
 * A300278 G.f.: 1 + Sum_{n&gt;=1} a(n)*x^n/(1 - x^n) = Product_{n&gt;=1} (1 + n*x^n).
 * @author Georg Fischer
 */
public class A300278 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A300278() {
    super(new A022629(), 1);
    next();
  }
}
