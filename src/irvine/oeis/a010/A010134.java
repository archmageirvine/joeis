package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010134 Continued fraction for <code>sqrt(43)</code>.
 * @author Sean A. Irvine
 */
public class A010134 extends PrependSequence {

  /** Construct the sequence. */
  public A010134() {
    super(new PeriodicSequence(1, 1, 3, 1, 5, 1, 3, 1, 1, 12), Z.SIX);
  }
}

