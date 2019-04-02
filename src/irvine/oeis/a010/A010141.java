package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010141 Continued fraction for sqrt(55).
 * @author Sean A. Irvine
 */
public class A010141 extends PrependSequence {

  /** Construct the sequence. */
  public A010141() {
    super(new PeriodicSequence(2, 2, 2, 14), Z.SEVEN);
  }
}

