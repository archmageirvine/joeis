package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010180 Continued fraction for sqrt(115).
 * @author Sean A. Irvine
 */
public class A010180 extends PrependSequence {

  /** Construct the sequence. */
  public A010180() {
    super(new PeriodicSequence(1, 2, 1, 1, 1, 1, 1, 2, 1, 20), Z.TEN);
  }
}

