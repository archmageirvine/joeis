package irvine.oeis.a270;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a003.A003136;
import irvine.oeis.a008.A008585;

/**
 * A270672 L\u00f6schian numbers (A003136) that are multiples of 3.
 * @author Georg Fischer
 */
public class A270672 extends IntersectionSequence {

  /** Construct the sequence. */
  public A270672() {
    super(new A008585(), new A003136());
  }
}
