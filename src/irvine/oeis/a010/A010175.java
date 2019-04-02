package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010175 Continued fraction for sqrt(109).
 * @author Sean A. Irvine
 */
public class A010175 extends PrependSequence {

  /** Construct the sequence. */
  public A010175() {
    super(new PeriodicSequence(2, 3, 1, 2, 4, 1, 6, 6, 1, 4, 2, 1, 3, 2, 20), Z.TEN);
  }
}

