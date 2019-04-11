package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010147 Continued fraction for <code>sqrt(67)</code>.
 * @author Sean A. Irvine
 */
public class A010147 extends PrependSequence {

  /** Construct the sequence. */
  public A010147() {
    super(new PeriodicSequence(5, 2, 1, 1, 7, 1, 1, 2, 5, 16), Z.EIGHT);
  }
}

