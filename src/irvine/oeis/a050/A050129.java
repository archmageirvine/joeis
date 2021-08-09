package irvine.oeis.a050;

import irvine.oeis.PositionOfNSequence;

/**
 * A050129 a(n) is the least k satisfying A050128(k) = n.
 * @author Sean A. Irvine
 */
public class A050129 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A050129() {
    super(new A050128(), 1);
  }
}
