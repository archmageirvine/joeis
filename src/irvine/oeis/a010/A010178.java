package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010178 Continued fraction for sqrt(113).
 * @author Sean A. Irvine
 */
public class A010178 extends PrependSequence {

  /** Construct the sequence. */
  public A010178() {
    super(new PeriodicSequence(1, 1, 1, 2, 2, 1, 1, 1, 20), Z.TEN);
  }
}

