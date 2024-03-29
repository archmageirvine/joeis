package irvine.oeis.a291;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a073.A073659;

/**
 * A291546 a(n) = Sum_{k=1..n} A073659(k).
 * @author Sean A. Irvine
 */
public class A291546 extends PartialSumSequence {

  /** Construct the sequence. */
  public A291546() {
    super(1, new A073659());
  }
}
