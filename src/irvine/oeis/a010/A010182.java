package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010182 Continued fraction for sqrt(117).
 * @author Sean A. Irvine
 */
public class A010182 extends PrependSequence {

  /** Construct the sequence. */
  public A010182() {
    super(new PeriodicSequence(1, 4, 2, 4, 1, 20), Z.TEN);
  }
}

