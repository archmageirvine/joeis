package irvine.oeis.a105;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a104.A104647;

/**
 * A105856 a(n) = a(n-1) + A104647(n), a(0) = 0.
 * @author Sean A. Irvine
 */
public class A105856 extends PartialSumSequence {

  /** Construct the sequence. */
  public A105856() {
    super(new A104647());
  }
}
