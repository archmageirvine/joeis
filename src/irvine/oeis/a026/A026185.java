package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026185 If n even, then <code>2n</code>. If n odd, then nearest integer to <code>2n/3</code>.
 * @author Sean A. Irvine
 */
public class A026185 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026185() {
    super(new A026184());
  }
}
