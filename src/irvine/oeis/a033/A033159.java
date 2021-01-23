package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A033159 Begins with (2, 3); avoids 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A033159 extends StanleySequence {

  /** Construct the sequence. */
  public A033159() {
    super(Z.TWO, Z.THREE);
  }
}
