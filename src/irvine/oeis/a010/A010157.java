package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010157 Continued fraction for sqrt(79).
 * @author Sean A. Irvine
 */
public class A010157 extends PrependSequence {

  /** Construct the sequence. */
  public A010157() {
    super(new PeriodicSequence(1, 7, 1, 16), Z.EIGHT);
  }
}

