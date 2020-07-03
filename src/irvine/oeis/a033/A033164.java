package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A033164 Begins with <code>(4, 5);</code> avoids 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A033164 extends StanleySequence {

  /** Construct the sequence. */
  public A033164() {
    super(Z.FOUR, Z.FIVE);
  }
}
