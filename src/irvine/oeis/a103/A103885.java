package irvine.oeis.a103;
// Generated by gen_seq4.pl holos [[0],[-6,37,-67,45,-10],[-48,304,-592,440,-110],[0,-11,37,-35,10]] [2,16,146] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A103885 a(n) = [x^(2*n)] ((1 + x)/(1 - x))^n.
 * @author Georg Fischer
 */
public class A103885 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A103885() {
    super(0, "[[0],[-6,37,-67,45,-10],[-48,304,-592,440,-110],[0,-11,37,-35,10]]", "[1,2,16]", 0);
  }
}
