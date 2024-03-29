package irvine.oeis.a185;
// Generated by gen_seq4.pl holos [[0],[-40,4,384,-220,-656,336],[44,-80,-411,821,607,-1365],[8,-8,-78,-16,130,84]] [1,4,27] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A185655 a(n) = Sum_{k=0..n} binomial(n+k, k)*binomial(n+k+1, k+1)/(n+1).
 * @author Georg Fischer
 */
public class A185655 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A185655() {
    super(0, "[[0],[-40,4,384,-220,-656,336],[44,-80,-411,821,607,-1365],[8,-8,-78,-16,130,84]]", "[1,4,27]", 0);
  }
}
