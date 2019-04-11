package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010177 Continued fraction for <code>sqrt(112)</code>.
 * @author Sean A. Irvine
 */
public class A010177 extends PrependSequence {

  /** Construct the sequence. */
  public A010177() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 20), Z.TEN);
  }
}

