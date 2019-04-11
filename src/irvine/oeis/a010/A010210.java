package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010210 Continued fraction for <code>sqrt(161)</code>.
 * @author Sean A. Irvine
 */
public class A010210 extends PrependSequence {

  /** Construct the sequence. */
  public A010210() {
    super(new PeriodicSequence(1, 2, 4, 1, 2, 1, 4, 2, 1, 24), Z.valueOf(12));
  }
}

