package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010137 Continued fraction for sqrt(47).
 * @author Sean A. Irvine
 */
public class A010137 extends PrependSequence {

  /** Construct the sequence. */
  public A010137() {
    super(new PeriodicSequence(1, 5, 1, 12), Z.SIX);
  }
}

