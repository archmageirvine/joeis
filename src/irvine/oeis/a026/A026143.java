package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026143 a(n) = position of n in A026142.
 * @author Sean A. Irvine
 */
public class A026143 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026143() {
    super(new A026142());
  }
}
