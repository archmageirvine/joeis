package irvine.oeis.a287;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000787;
import irvine.oeis.a029.A029742;

/**
 * A287092 Strobogrammatic nonpalindromic numbers.
 * @author Georg Fischer
 */
public class A287092 extends IntersectionSequence {

  /** Construct the sequence. */
  public A287092() {
    super(new A000787(), new A029742());
  }
}
