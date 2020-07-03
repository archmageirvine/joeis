package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A033161 Begins with <code>(2, 5);</code> avoids 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A033161 extends StanleySequence {

  /** Construct the sequence. */
  public A033161() {
    super(Z.TWO, Z.FIVE);
  }
}
