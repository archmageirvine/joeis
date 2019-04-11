package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A033160 Begins with <code>(2, 4)</code>; avoids 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A033160 extends StanleySequence {

  /** Construct the sequence. */
  public A033160() {
    super(Z.TWO, Z.FOUR);
  }
}
