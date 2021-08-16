package irvine.oeis.a050;

import irvine.oeis.PositionOfNSequence;

/**
 * A050417 Least k such that A050416(k) = n.
 * @author Sean A. Irvine
 */
public class A050417 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A050417() {
    super(new A050416());
  }
}
