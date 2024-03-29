package irvine.oeis.a194;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a022.A022838;

/**
 * A194106 Sum{floor(j*sqrt(3)) : 1&lt;=j&lt;=n}; n-th partial sum of Beatty sequence for sqrt(3).
 * @author Sean A. Irvine
 */
public class A194106 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194106() {
    super(1, new A022838());
  }
}
