package irvine.oeis.a078;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002858;

/**
 * A078663 a(n) = Sum_{i=1..n} Ulam(i), where Ulam(i) denotes the i-th Ulam number.
 * @author Sean A. Irvine
 */
public class A078663 extends PartialSumSequence {

  /** Construct the sequence. */
  public A078663() {
    super(1, new A002858());
  }
}
