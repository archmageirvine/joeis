package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a007.A007407;

/**
 * A073526 Denominator of Sum_{k=1..n} 1/k^2 is a square.
 * @author Sean A. Irvine
 */
public class A073526 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073526() {
    super(1, new A007407(), SQUARE);
  }
}
