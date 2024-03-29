package irvine.oeis.a141;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a002.A002182;
import irvine.oeis.a002.A002183;

/**
 * A141320 Both n and the smallest number with n divisors are in A002182.
 * @author Georg Fischer
 */
public class A141320 extends IntersectionSequence {

  /** Construct the sequence. */
  public A141320() {
    super(new A002182(), new A002183());
  }
}
