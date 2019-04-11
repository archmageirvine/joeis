package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A033163 Begins with <code>(3, 5)</code> and avoids 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A033163 extends StanleySequence {

  /** Construct the sequence. */
  public A033163() {
    super(Z.THREE, Z.FIVE);
  }
}
