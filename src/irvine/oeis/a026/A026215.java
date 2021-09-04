package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026215 a(n) is the position of n in A026214.
 * @author Sean A. Irvine
 */
public class A026215 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026215() {
    super(new A026214());
  }
}
