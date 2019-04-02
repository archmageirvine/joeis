package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010130 Continued fraction for sqrt(32).
 * @author Sean A. Irvine
 */
public class A010130 extends PrependSequence {

  /** Construct the sequence. */
  public A010130() {
    super(new PeriodicSequence(1, 1, 1, 10), Z.FIVE);
  }
}

