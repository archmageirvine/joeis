package irvine.oeis.a058;

import irvine.oeis.PositionSequence;
import irvine.oeis.a065.A065413;

/**
 * A058898 Inconsummate numbers in base 2: no number is this multiple of the sum of its digits (in base 2).
 * @author Sean A. Irvine
 */
public class A058898 extends PositionSequence {

  /** Construct the sequence. */
  public A058898() {
    super(1, new A065413(), 0);
  }
}
