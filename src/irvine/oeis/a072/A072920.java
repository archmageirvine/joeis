package irvine.oeis.a072;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a034.A034693;

/**
 * A072920 a(n) = Sum_{k=1..n} A034693(k).
 * @author Sean A. Irvine
 */
public class A072920 extends PartialSumSequence {

  /** Construct the sequence. */
  public A072920() {
    super(1, new A034693());
  }
}
