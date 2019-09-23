package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026211 <code>a(n) =</code> position of n in <code>A026210</code>.
 * @author Sean A. Irvine
 */
public class A026211 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026211() {
    super(new A026210());
  }
}
