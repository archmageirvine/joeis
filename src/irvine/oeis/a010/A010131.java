package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010131 Continued fraction for <code>sqrt(33)</code>.
 * @author Sean A. Irvine
 */
public class A010131 extends PrependSequence {

  /** Construct the sequence. */
  public A010131() {
    super(new PeriodicSequence(1, 2, 1, 10), Z.FIVE);
  }
}

