package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010163 Continued fraction for <code>sqrt(92)</code>.
 * @author Sean A. Irvine
 */
public class A010163 extends PrependSequence {

  /** Construct the sequence. */
  public A010163() {
    super(new PeriodicSequence(1, 1, 2, 4, 2, 1, 1, 18), Z.NINE);
  }
}

