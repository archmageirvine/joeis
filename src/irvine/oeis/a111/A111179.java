package irvine.oeis.a111;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a039.A039716;

/**
 * A111179 a(n) = Sum_{k=1..n} prime(k)!, where prime(k) is k-th prime.
 * @author Sean A. Irvine
 */
public class A111179 extends PartialSumSequence {

  /** Construct the sequence. */
  public A111179() {
    super(1, new A039716());
  }
}
