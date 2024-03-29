package irvine.oeis.a205;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005449;
import irvine.oeis.a024.A024675;

/**
 * A205881 Second pentagonal numbers that are interprime.
 * @author Georg Fischer
 */
public class A205881 extends IntersectionSequence {

  /** Construct the sequence. */
  public A205881() {
    super(new A005449(), new A024675());
  }
}
