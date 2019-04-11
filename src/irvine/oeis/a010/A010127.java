package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010127 Continued fraction for <code>sqrt(23)</code>.
 * @author Sean A. Irvine
 */
public class A010127 extends PrependSequence {

  /** Construct the sequence. */
  public A010127() {
    super(new PeriodicSequence(1, 3, 1, 8), Z.FOUR);
  }
}

