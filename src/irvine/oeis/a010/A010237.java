package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010237 Continued fraction for sqrt(199).
 * @author Sean A. Irvine
 */
public class A010237 extends PrependSequence {

  /** Construct the sequence. */
  public A010237() {
    super(new PeriodicSequence(9, 2, 1, 2, 2, 5, 4, 1, 1, 13, 1, 1, 4, 5, 2, 2, 1, 2, 9, 28), Z.valueOf(14));
  }
}

