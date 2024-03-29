package irvine.oeis.a194;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a022.A022841;

/**
 * A194111 Sum{floor(j*sqrt(7)) : 1&lt;=j&lt;=n}; n-th partial sum of Beatty sequence for sqrt(7).
 * @author Sean A. Irvine
 */
public class A194111 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194111() {
    super(1, new A022841());
  }
}
