package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A071710.
 * @author Sean A. Irvine
 */
public class A053169 extends ComplementSequence {

  /** Construct the sequence. */
  public A053169() {
    super(1, new A053873(), Z.ONE);
  }
}
