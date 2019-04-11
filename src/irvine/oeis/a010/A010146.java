package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010146 Continued fraction for <code>sqrt(62)</code>.
 * @author Sean A. Irvine
 */
public class A010146 extends PrependSequence {

  /** Construct the sequence. */
  public A010146() {
    super(new PeriodicSequence(1, 6, 1, 14), Z.SEVEN);
  }
}

