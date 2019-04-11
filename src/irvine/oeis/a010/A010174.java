package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010174 Continued fraction for <code>sqrt(108)</code>.
 * @author Sean A. Irvine
 */
public class A010174 extends PrependSequence {

  /** Construct the sequence. */
  public A010174() {
    super(new PeriodicSequence(2, 1, 1, 4, 1, 1, 2, 20), Z.TEN);
  }
}

