package irvine.oeis.a094;
// Generated by gen_seq4.pl holos [[0],[-512],[6965249],[6826204],[-139823],[-265],[1]] [1,2,48622,9373652,9263421862,3433541316152] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A094213 a(n) = Sum_{k=0..n} binomial(9*n,9*k).
 * @author Georg Fischer
 */
public class A094213 extends HolonomicRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A094213() {
    super(1, "[[0],[-512],[6965249],[6826204],[-139823],[-265],[1]]", "[1,2,48622,9373652,9263421862,3433541316152]", 0);
  }
}
