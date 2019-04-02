package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010186 Continued fraction for sqrt(125).
 * @author Sean A. Irvine
 */
public class A010186 extends PrependSequence {

  /** Construct the sequence. */
  public A010186() {
    super(new PeriodicSequence(5, 1, 1, 5, 22), Z.valueOf(11));
  }
}

