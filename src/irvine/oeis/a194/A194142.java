package irvine.oeis.a194;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a182.A182777;

/**
 * A194142 a(n) = Sum_{j=1..n} floor(j*(3-sqrt(3))); n-th partial sum of Beatty sequence for 3-sqrt(3).
 * @author Sean A. Irvine
 */
public class A194142 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194142() {
    super(1, new A182777());
  }
}
