package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A033158 Begins with (1, 5); avoids 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A033158 extends StanleySequence {

  /** Construct the sequence. */
  public A033158() {
    super(Z.ONE, Z.FIVE);
  }
}
