package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026248 a(n) = position of n in A026247.
 * @author Sean A. Irvine
 */
public class A026248 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026248() {
    super(new A026247());
  }
}
