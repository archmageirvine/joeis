package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010123 Continued fraction for sqrt(14).
 * @author Sean A. Irvine
 */
public class A010123 extends PrependSequence {

  /** Construct the sequence. */
  public A010123() {
    super(new PeriodicSequence(1, 2, 1, 6), Z.THREE);
  }
}

