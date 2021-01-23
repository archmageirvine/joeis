package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A033157 Begins with (1, 4); avoids 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A033157 extends StanleySequence {

  /** Construct the sequence. */
  public A033157() {
    super(Z.ONE, Z.FOUR);
  }
}
