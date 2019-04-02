package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010150 Continued fraction for sqrt(71).
 * @author Sean A. Irvine
 */
public class A010150 extends PrependSequence {

  /** Construct the sequence. */
  public A010150() {
    super(new PeriodicSequence(2, 2, 1, 7, 1, 2, 2, 16), Z.EIGHT);
  }
}

