package irvine.oeis.a194;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a327.A327183;

/**
 * A194819 Number of integers k in [1,n] such that {n*e+k*e} &lt; {n*e-k*e}, where { } = fractional part.
 * @author Sean A. Irvine
 */
public class A194819 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194819() {
    super(1, new A327183());
  }
}
